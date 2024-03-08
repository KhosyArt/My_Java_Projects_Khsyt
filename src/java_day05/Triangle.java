package java_day05;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 0; i <= 10 ; i++) {
            System.out.print("\t\t\t");

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

}

/*
Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */
