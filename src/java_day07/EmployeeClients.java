package java_day07;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.age = 28;
        employee1.gender = 'M';
        employee1.salary = 140_000;
        employee1.jobTitle = "Software Developer";

        employee1.work();

        System.out.println(employee1);


        Employee employee2 = new Employee();
        employee2.name = "Christine";
        employee2.age = 30;
        employee2.gender = 'F';
        employee2.salary = 105_000;
        employee2.jobTitle = "SDET";

        employee2.work();

        System.out.println(employee2);


    }
}
