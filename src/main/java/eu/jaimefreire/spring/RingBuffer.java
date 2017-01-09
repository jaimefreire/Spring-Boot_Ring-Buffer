package eu.jaimefreire.spring;

/**
 * Created by jaimefreire on 26.10.16.
 */
import java.util.*;

public class RingBuffer<T> implements IBuffer<T> {
    //
    private int readIdx;
    private int writeIdx;
    private int bufferSize=10;
    //
    private Queue<T> ring;

    public RingBuffer(final int bufferSize)
    {
        this.bufferSize=bufferSize;
        ring = new LinkedList<T>();

    }

    @Override
    public void push(T obj) {
        if (writeIdx<size()) {
            writeIdx++;
            this.ring.add(obj);
        }
    }

    @Override
    public void push(List<T> obj) {

    }

    @Override
    public T popFront() {
        return null;
    }

    @Override
    public T popBack() {
        if (readIdx>writeIdx) {
            readIdx++;
            return ring.poll();
        }
        return null;
    }

    @Override
    public List<T> pop(int maxSize) {
        return null;
    }

    @Override
    public void pushNoWait(T obj) {
        this.push(obj);
    }

    @Override
    public boolean pushNoWait(List<T> obj) {
        return false;
    }

    @Override
    public int getBuffer() {
        return this.bufferSize;
    }

    @Override
    public int size() {
        return this.ring.size();
    }

    @Override
    public boolean clear() {
        return false;
    }
}
