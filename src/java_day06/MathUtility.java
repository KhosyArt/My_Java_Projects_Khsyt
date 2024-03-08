package java_day06;

public class MathUtility {

    public static void main(String[] args) {
        int mathOperate = calculateResult(10, '+', 20);
        double mathOperate2 = calculateResult(2.5, '*', 3.0);
        int squareInt = square(8);
        double squareDouble = square(1.5);
        int cubeInt = cube(3);
        double cubeDouble = cube(2.5);

        System.out.println(mathOperate);
        System.out.println(mathOperate2);
        System.out.println(squareInt);
        System.out.println(squareDouble);
        System.out.println(cubeInt);
        System.out.println(cubeDouble);
    }

    public static int calculateResult(int num1, char math, int num2){
        switch (math) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }

    public static double calculateResult(double num1, char math, double num2){
        switch (math) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }

    public static int square(int num1) {
        return num1 * num1;
    }

    public static double square(double num1) {
        return num1 * num1;
    }

    public static int cube(int num1) {
        return num1 * num1 * num1;
    }

    public static double cube(double num1) {
        return num1 * num1 * num1;
    }
}


/*
Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
 */