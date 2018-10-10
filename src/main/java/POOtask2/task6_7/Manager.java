package task6_7;

public class Manager extends Employee {

    public Manager(int hours) {
        super(hours);
    }

    @Override
    public double getSalary(){
        double salaryManager =super.getSalary();
        return salaryManager+=(salaryManager*0.5);
    }
}
