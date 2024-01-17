import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Queue<T> {
    private List<T> queue; // ArrayList to store elements
    private int rear;     // Index of the rear (end) of the queue
    private int front;    // Index of the front of the queue
    private int size;     // Number of elements in the queue

    // Constructor to initialize the queue
    public Queue() {
        queue = new ArrayList<>();
        rear = -1;
        front = 0;
        size = 0;
    }

    // Method to add an item to the rear of the queue
    public void enqueue(T item) {
        queue.add(item);
        rear++;
        size++;
    }

    // Method to remove and return the item from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dequeuedItem = queue.get(front);
        front++;
        size--;
        return dequeuedItem;
    }

    // Method to return the item at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.get(front);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to return the number of items in the queue
    public int size() {
        return size;
    }

    // Optional method: Clear the queue (remove all elements)
    public void clear() {
        queue.clear();
        rear = -1;
        front = 0;
        size = 0;
    }

    // Optional method: Check if the queue contains a specific item
    public boolean contains(T item) {
        return queue.contains(item);
    }
}