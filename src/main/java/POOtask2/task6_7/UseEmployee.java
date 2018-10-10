package task6_7;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(8);
        System.out.println("Employee: \nTariff per hour: " + employee.getTariffPerHour()+"\n"
                +"Salary on month: " + employee.getSalary());

        Manager manager = new Manager(8);
        System.out.println("Manager: \nTariff per hour: " + manager.getTariffPerHour()+"\n"
                +"Salary on month: " + manager.getSalary());

    }
}
