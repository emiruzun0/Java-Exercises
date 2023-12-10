public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size : " + queue.size());
        System.out.println("First element : " + queue.peek());

        while(!queue.isEmpty()){
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Is the queue empty ? : " + queue.isEmpty());
    }
}
