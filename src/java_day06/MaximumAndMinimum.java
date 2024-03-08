package java_day06;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        double x = max(10.5,30.2);
        System.out.println(x);
        int y = min(100,200);
        System.out.println(y);
    }

    public static int max(int a,int b){
        if (a>b){
            return a;
        }else { return b;}
    }
    public static double max (double a, double b){
        if (a>b) { return a;
        }else {return b;}}
    public static int min(int a, int b){
        if (a<b){ return a;}else {return b;}

    }
    public static double min(double a , double b){
        if (a<b) {
            return a;
        }else {return b;}

    }
}

/*
Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100
 */