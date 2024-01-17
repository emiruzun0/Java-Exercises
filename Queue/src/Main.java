public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}