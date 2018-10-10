package task3;

import org.junit.Test;

public class StudentTest {
    @Test
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setData("Ion",18);
        Student student2 = new Student();
        student2.setData("Eugen",21);

        System.out.println("Average: " + new CalcAverage().average(student1,student2));
    }
}