import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Create a custom priority queue with a custom comparator
        Comparator<Task<String>> comparator = new MyComparator<>();
        MyPriorityQueue<String> priorityQueue = new MyPriorityQueue<>(comparator);

        // Enqueue some tasks ( 1 is highest priority and 10 is the least one)
        priorityQueue.enqueue("Task 1", 5);
        priorityQueue.enqueue("Task 2", 3);
        priorityQueue.enqueue("Task 3", 7);
        priorityQueue.enqueue("Task 4", 2);

        // Display and dequeue tasks
        System.out.println("Dequeueing tasks:");
        while (!priorityQueue.isEmpty()) {
            Task<String> task = priorityQueue.dequeueTask();
            System.out.println("Task: " + task.getItem() + " (Priority: " + task.getPriority() + ")");
        }
    }



}
