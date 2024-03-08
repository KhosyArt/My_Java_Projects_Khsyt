package day09_practice_tasks;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classMates = {"Khosiyat Akhmedova", "Marcela Vazquez", "Ridwan Khafagi", "Bengisu Karadeniz",
                "Gulbahor Gulbahor", "Marina Marina", "Nilufar Karimova", "Santiago Lopez", "Winniffer Diluyo", "Zakarya Ameen"};

        String [] initials = new
        String[classMates.length];

        for (int i = 0; i < initials.length; i++) {

            initials [i] = classMates[i].charAt(0) + " " + classMates[i].charAt(classMates[i].indexOf(" ")+1);

            System.out.println(initials[i]);

        }

    }
}
/*
Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */
