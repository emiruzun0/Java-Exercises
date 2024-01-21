public class Task<T> {
    private T item;
    private int priority;

    public Task(T item, int priority) {
        this.item = item;
        this.priority = priority;
    }

    public T getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }
}
