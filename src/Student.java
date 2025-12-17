import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int sNumber;

    public Student(String name, int sNumber){
        this.name = name;
        this.sNumber = sNumber;
    }
    @Override
    public String toString(){
        return "Student(" + this.name + ", " + this.sNumber+")";
    }
    @Override
    public int compareTo(Student o){
        return this.sNumber - o.sNumber;
    }

    public String getName() {
        return name;
    }

    public int getsNumber() {
        return sNumber;
    }

    public boolean equals(Student stud){
        if(this == stud) return true;
        if (stud == null) return false;

        return this.sNumber == stud.sNumber
                && this.name.equals(stud.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return sNumber == student.sNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + sNumber;
        return result;
    }
}
