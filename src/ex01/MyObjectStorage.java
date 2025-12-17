package ex01;

public abstract class MyObjectStorage {

    private Object[] data;
    private int count;

    public MyObjectStorage(){
        this.data = new Object[20];
        this.count = 0;
    }

    public void add(Object ob){
        this.data[count++] = ob;
    }
    public Object get(int index){
        return this.data[index];
    }
}
