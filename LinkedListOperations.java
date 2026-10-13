public class LinkedListOperations {
    
    // Node class representing each element in the Singly Linked List
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedListOperations() {
        this.head = null;
    }

    // Insert at End
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " as the head node.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Inserted " + data + " at the end of the Linked List.");
    }

    // Delete Element
    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked List is empty. Cannot delete.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted " + data + " from the Linked List.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Deleted " + data + " from the Linked List.");
        } else {
            System.out.println("Element " + data + " not found in the Linked List.");
        }
    }

    // Search Element
    public void search(int data) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = head;
        int index = 0;
        int steps = 0;
        while (temp != null) {
            steps++;
            if (temp.data == data) {
                System.out.println("Element " + data + " found at node index " + index);
                System.out.println("Search steps taken: " + steps);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Element " + data + " not found in the Linked List.");
        System.out.println("Search steps taken: " + steps);
    }

    // Display Linked List
    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
