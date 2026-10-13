public class QueueOperations {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public QueueOperations(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue Operation
    public void enqueue(int element) {
        if (count == capacity) {
            System.out.println("Queue Overflow! Cannot enqueue element " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        count++;
        System.out.println("Enqueued " + element + " to Queue.");
    }

    // Dequeue Operation
    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow! Cannot dequeue from an empty queue.");
            return;
        }
        System.out.println("Dequeued " + queue[front] + " from Queue.");
        front = (front + 1) % capacity;
        count--;
    }

    // Peek/Front Operation
    public void peek() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front element is: " + queue[front]);
    }

    // Display Queue
    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue Elements (Front to Rear): ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
