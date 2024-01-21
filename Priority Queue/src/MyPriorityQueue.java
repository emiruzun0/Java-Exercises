import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue<T> {
    private Queue<Task<T>> priorityQueue;

    public MyPriorityQueue(Comparator<Task<T>> comparator) {
        this.priorityQueue = new PriorityQueue<>(comparator);
    }

    // Enqueue a task with a priority
    public void enqueue(T item, int priority) {
        Task<T> task = new Task<>(item, priority);
        priorityQueue.offer(task);
    }

    // Dequeue the highest-priority task
    public T dequeue() {
        Task<T> task = priorityQueue.poll();
        return (task != null) ? task.getItem() : null;
    }

    // Dequeue and return the highest-priority task without removing it
    public Task<T> dequeueTask() {
        return priorityQueue.poll();
    }


    // Peek at the highest-priority task
    public T peek() {
        Task<T> task = priorityQueue.peek();
        return (task != null) ? task.getItem() : null;
    }

    // Check if the Priority Queue is empty
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    // Get the number of items in the Priority Queue
    public int size() {
        return priorityQueue.size();
    }
}
