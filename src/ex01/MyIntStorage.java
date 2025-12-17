package ex01;

public class MyIntStorage {

    private int[] data;
    private int count;

    public MyIntStorage(){
        this.data = new int[20];
        this.count = 0;
    }
    public void add(int val){
        this.data[count++] = val;
    }

    public int get(int index){
        return this.data[index];
    }
}
