import java.util.EmptyStackException;

public class ArrayQueue<T> {
    private Object[] queue; // Array to store elements
    private int rear;      // Index of the rear (end) of the queue
    private int front;     // Index of the front of the queue
    private int size;      // Number of elements in the queue
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to initialize the array-based queue with a default capacity
    public ArrayQueue() {
        queue = new Object[DEFAULT_CAPACITY];
        rear = -1;
        front = 0;
        size = 0;
    }

    // Constructor to initialize the array-based queue with a specified capacity
    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        queue = new Object[capacity];
        rear = -1;
        front = 0;
        size = 0;
    }

    // Method to add an item to the rear of the queue
    public void enqueue(T item) {
        if (isFull()) {
            resizeQueue();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    // Method to remove and return the item from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dequeuedItem = (T) queue[front];
        queue[front] = null; // Clear the reference to the dequeued item
        front = (front + 1) % queue.length;
        size--;
        return dequeuedItem;
    }

    // Method to return the item at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == queue.length;
    }

    // Method to return the number of items in the queue
    public int size() {
        return size;
    }

    // Optional method: Clear the queue (remove all elements)
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    // Optional method: Check if the queue contains a specific item
    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            if (queue[index].equals(item)) {
                return true;
            }
        }
        return false;
    }

    // Optional method: Resize the queue to double its capacity
    private void resizeQueue() {
        int newCapacity = queue.length * 2;
        Object[] newQueue = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            newQueue[i] = queue[index];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
    }
}