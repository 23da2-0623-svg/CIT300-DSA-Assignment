import java.util.Scanner;

public class ArrayOperations {
    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Insert Element
    public void insert(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
            System.out.println("Element " + element + " inserted successfully.");
        } else {
            System.out.println("Array is full! Cannot insert element.");
        }
    }

    // Delete Element
    public void delete(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            System.out.println("Element " + element + " deleted successfully.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Display Array
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }
}
