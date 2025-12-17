import ex01.Student;
import ex02.MyStorage;
import ex03.SortStudentBy;
import ex04.Card;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyStorage<Student> studStorage = new MyStorage<>();

        studStorage.add(
                new Student("Jan", 1701)
        );
        System.out.println(
                studStorage.get(0)
        );
        //================================================
        MyStorage myStorage = new MyStorage();


        //===========================================
        Student[] students = new Student[]{
                new Student("Jan", 1703),
                new Student("Ola", 87532)
        };

        Arrays.sort(students);

        for (Student s : students)
            System.out.println(s);

        Arrays.sort(
                students,
                (o1, o2) ->
                        o2.getsNumber() - o1.getsNumber()
        );
        for (Student s : students) {
            System.out.println(s);
        }

        int sortType = 1;
        mySort(SortStudentBy.NAME, students);

        System.out.println(Card.TWO.getValue());

        System.out.println(Card.valueOf("ACE"));
    }


    public static void mySort(SortStudentBy sortType, Student[] students) {
        switch (sortType) {
            case SNUMBER_D -> Arrays.sort(
                    students,
                    (o1, o2) ->
                            o2.getsNumber() - o1.getsNumber()
            );
            case SNUMBER_A -> Arrays.sort(
                    students,
                    (o1, o2) ->
                            o1.getsNumber() - o2.getsNumber()
            );
            case NAME -> Arrays.sort(
                    students,
                    (o1, o2) ->
                            o1.getName().compareTo(o2.getName())
            );
        }
    }
}