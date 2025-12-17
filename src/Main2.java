import ex01.Student;
import ex02.MyStorage;

import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {

        int[] tab = new int[]{5, 2, 4, 7};

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + ", ");
        System.out.println();

        for (int v : tab)
            System.out.print(v + ", ");
        System.out.println();
        System.out.println("=========================");


        Student[] students = new Student[]{
                new Student("Jan", 1703),
                new Student("Ola", 87532)
        };
        MyStorage<Student> studStorage = new MyStorage<>();
        studStorage.add(new Student("Jan", 12321));
        studStorage.add(new Student("Makapaka", 2143124));
        for(Student student : students)
            System.out.print(student+ ", ");
        System.out.println();
        {
         ///   Iterator<Student> iterator = studStorage.iterator();
         ///   System.out.println(iterator.next() + ", ");
         ///   System.out.println(iterator.next() + ", ");
          ///  System.out.println(iterator.next() + ", ");
          ///  System.out.println(iterator.next() + ", ");
           /// System.out.println();
        }


        //===========================================
        {
            for(
                    Iterator<Student> iterator = studStorage.iterator();
                    iterator.hasNext();
            )
                System.out.print(iterator.next()+ ", ");
            System.out.println();
            Iterator<Student> iterator = studStorage.iterator();
            while(iterator.hasNext())
                System.out.print(iterator.next()+ ", ");
            System.out.println();
        }

        Student s1 = new Student("Jan", 1701);
        Student s2 = new Student("Jan", 1701);

        System.out.println(" == " + (s1 == s2));
        System.out.println("equals(...)" + (s1.equals(s2)));

        Object o1 = s1;
        Object o2 = s2;

        System.out.println("equals(...)" + (o1.equals(o2)));
    }
}
