package task6_7;

public class Employee {
    private double tariffPerHour = 5.5;
    public int hours;

    public Employee(int hours) {
        this.hours = hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary(){
        int workDaysInMonth = 20;
        return hours * tariffPerHour * workDaysInMonth;
    }
}
