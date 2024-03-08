package java_day07;

public class Rectangle {

        double width;
        double length;

        public double calculateArea() {
            return width * length;
        }

        public double calculatePerimeter() {
            return 2 * (width + length);
        }

        public String toString() {
            return "Rectangle{" +
                    "width='" + width + '\'' +
                    ", length=" + length +
                    ", calculateArea=" + calculateArea() +
                    ", calculatePerimeter='" + calculatePerimeter() +
                    '}';
        }

    }

