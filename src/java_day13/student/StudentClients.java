package day13_practice_tasks.student;

public class StudentClients {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Khosiyat", 36, "Female", "5555", "testing",
                'A', "Cydeo", 33, 5, "Java");

        System.out.println(cydeoStudent1.getName());
        System.out.println(cydeoStudent1.getAge());
        System.out.println(cydeoStudent1.getGender());
        System.out.println(cydeoStudent1.getStudentId());
        System.out.println(cydeoStudent1.getFieldOfStudy());
        System.out.println(cydeoStudent1.getGrade());
        System.out.println(cydeoStudent1.getSchoolName());
        System.out.println(cydeoStudent1.getBatchNumber());
        System.out.println(cydeoStudent1.getGroupNumber());
        System.out.println(cydeoStudent1.getProgrammingLanguage());
        cydeoStudent1.study();
        System.out.println(cydeoStudent1);

        System.out.println();

        GraduateStudent graduateStudent1 = new GraduateStudent("Khosiyat", 36, "Female", "5555", "testing",
                'A', "Cydeo");
        System.out.println(graduateStudent1);
        graduateStudent1.study();

        System.out.println();

        Student1 student1 = new Student1("Khosiyat", 36, "Female", "5555", "testing",
                'A', "Cydeo");
        System.out.println(student1);
        student1.study();

        System.out.println();

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("Khosiyat", 36, "Female", "5555", "testing",
                'A', "Cydeo");
        System.out.println(undergraduateStudent1);
        undergraduateStudent1.study();


    }
}
