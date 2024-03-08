package java_day04;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10, n2 = 20;

        char operator = '+';

        String result;

        switch (operator) {
            case '-':
                System.out.println(n1 - n2);
                break;
            case '+':
                System.out.println(n1 + n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
