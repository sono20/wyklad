package ex02;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public
class MyStorage<T>
    implements Iterable<T> {
    private T[] data;
    private int count;

    public MyStorage(){
        this.data = (T[]) new Object[20];
        this.count = 0;
    }
    public void add(T type){
        this.data[count++] = type;
    }
    public T get(int index){
        return this.data[index];
    }
    @Override
    public Iterator<T> iterator(){



        return new Iterator<T>() {
            private int iterCount = 0;
            private final int onCreationCount = count;
            @Override
            public boolean hasNext() {
                if(onCreationCount != count)
                    throw new ConcurrentModificationException();
                return iterCount< count;
            }

            @Override
            public T next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                return data[iterCount++];
            }
        };
    }
}
