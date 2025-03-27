package queue;

import java.util.LinkedList;
import java.util.List;

public class LIFOQueue<T> implements IQueue<T>{

    private final List<T> data = new LinkedList<>();
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public T dequeue() {
        return data.removeLast();
    }
    @Override
    public void enqueue(T element) {
        data.add(element);
    }
}
