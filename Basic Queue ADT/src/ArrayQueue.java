import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayQueue implements Queue{
    private ArrayList<Object> queue;

    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void enqueue(Object item) {
        queue.add(item);
    }

    @Override
    public Object dequeue() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object a = queue.get(0);
        queue.remove(0);
        return a;
    }

    @Override
    public Object peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }
}
