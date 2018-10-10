package task3;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public int getAge() {
        return age;
    }
    public void setData(String name,int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
