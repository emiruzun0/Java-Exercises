import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Object> stack; // ArrayList to store elements

    // Constructor to initialize the stack
    public Stack() {
        stack = new ArrayList<>();
    }

    // Method to add an item to the top of the stack
    public void push(Object item) {
        stack.add(item);
    }

    // Method to remove and return the item from the top of the stack
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        Object poppedItem = stack.remove(lastIndex);
        return poppedItem;
    }

    // Method to return the item at the top of the stack without removing it
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to return the number of items in the stack
    public int size() {
        return stack.size();
    }
}