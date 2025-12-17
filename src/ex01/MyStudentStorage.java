package ex01;

public class MyStudentStorage extends MyObjectStorage {
    @Override
    public Student get(int index) {
        return (Student) super.get(index);
    }
}