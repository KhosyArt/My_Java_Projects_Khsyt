package day11_practice_tasks;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Alice", 25, 101, 'A', 2022, 3);
        CydeoStudent student2 = new CydeoStudent("Bob", 27, 102, 'B', 2023, 1);

        // Testing actions and methods
        student1.study();
        student2.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgrammingLanguage();

        // Testing toString() method
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
