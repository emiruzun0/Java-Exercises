import java.util.Comparator;

public class MyComparator<T> implements Comparator<Task<T>> {
    @Override
    public int compare(Task<T> task1, Task<T> task2) {
        // Compare tasks based on their priorities
        return Integer.compare(task1.getPriority(), task2.getPriority());
    }
}
