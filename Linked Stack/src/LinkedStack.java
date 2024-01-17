import java.util.EmptyStackException;

public class LinkedStack<T> {
    private Node<T> top; // Reference to the top node of the stack
    private int size;    // Number of elements in the stack

    // Inner class representing a node in the linked structure
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the linked stack
    public LinkedStack() {
        top = null;
        size = 0;
    }

    // Method to add an item to the top of the stack
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Method to remove and return the item from the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T poppedItem = top.data;
        top = top.next;
        size--;
        return poppedItem;
    }

    // Method to return the item at the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to return the number of items in the stack
    public int size() {
        return size;
    }

    // Optional method: Clear the stack (remove all elements)
    public void clear() {
        top = null;
        size = 0;
    }

    // Optional method: Check if the stack contains a specific item
    public boolean contains(T item) {
        Node<T> current = top;
        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}