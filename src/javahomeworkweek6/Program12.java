package javahomeworkweek6;

/*
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

import java.util.Scanner;

public class Program12 {
    public static void method1(double a, double b, double c, double d, double e, double f){
        double number = ((a * b - c * d) / (e - f));
        System.out.println("Expected output : " + number);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        double a = scanner.nextDouble();
        System.out.println("Enter the number");
        double b = scanner.nextDouble();
        System.out.println("Enter the number");
        double c = scanner.nextDouble();
        System.out.println("Enter the number");
        double d = scanner.nextDouble();
        System.out.println("Enter the number");
        double e = scanner.nextDouble();
        System.out.println("Enter the number");
        double f = scanner.nextDouble();
        method1(a, b, c, d, e, f);
        scanner.close();

    }
}