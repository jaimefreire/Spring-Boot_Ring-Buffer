package eu.jaimefreire.spring;

import java.util.List;

/**
 * Created by jaimefreire on 26.10.16.
 */
public interface IBuffer<T> {

    public void push(T obj);

    public void push(List<T> obj);

    public T popFront();

    public T popBack();

    public List<T> pop(int maxSize);

    public void pushNoWait(T obj);

    public boolean pushNoWait(List<T> obj);

    public int getBuffer();

    public int size();

    public boolean clear();

}
