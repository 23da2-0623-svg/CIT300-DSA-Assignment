public class StackOperations {
    private int[] stack;
    private int top;
    private int capacity;

    public StackOperations(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push Operation
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push element " + element);
            return;
        }
        stack[++top] = element;
        System.out.println("Pushed " + element + " onto Stack.");
    }

    // Pop Operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return;
        }
        System.out.println("Popped " + stack[top--] + " from Stack.");
    }

    // Peek Operation
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }

    // Display Stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack Elements (Top to Bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
