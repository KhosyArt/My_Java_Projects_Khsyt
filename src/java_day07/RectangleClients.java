package java_day07;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 12.45;
        rectangle1.length = 23.02;

        System.out.println(rectangle1);
        System.out.println(rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 2.45;
        rectangle2.length = 13.22;

        System.out.println(rectangle2);
        System.out.println(rectangle2.calculateArea());
    }
}
