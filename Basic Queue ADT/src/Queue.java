public interface Queue {
    void enqueue(Object item);
    Object dequeue();
    Object peek();
    boolean isEmpty();
    int size();
}
