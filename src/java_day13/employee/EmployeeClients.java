package day13_practice_tasks.employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Alex", "1111", "Developer", 180_000, "TMobile", "Java");

        System.out.println(developer1.getName());
        System.out.println(developer1.getEmployeeId());
        System.out.println(developer1.getJobTitle());
        System.out.println(developer1.getSalary());
        System.out.println(developer1.getCompanyName());
        System.out.println(developer1.getProgrammingLanguage());
        developer1.work();
        System.out.println(developer1);

        System.out.println();


        Teacher teacher1 = new Teacher("Daphne", "2222", "Teacher", 43_000, "Basis");

        System.out.println(teacher1.getName());
        System.out.println(teacher1.getEmployeeId());
        System.out.println(teacher1.getJobTitle());
        System.out.println(teacher1.getSalary());
        System.out.println(teacher1.getCompanyName());
        teacher1.work();
        System.out.println(teacher1);

        System.out.println();

        Driver driver1 = new Driver("Tim", "3333", "Driver", 80_000, "Track");

        System.out.println(driver1.getName());
        System.out.println(driver1.getEmployeeId());
        System.out.println(driver1.getJobTitle());
        System.out.println(driver1.getSalary());
        System.out.println(driver1.getCompanyName());
        driver1.work();
        System.out.println(driver1);


    }

}
