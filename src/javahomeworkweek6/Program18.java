package javahomeworkweek6;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Program18 {
    public static void myMethod(int a, int b ){
        int x1 = a + b;
        int x2 = a * b;
        int x3 = a - b;
        int x4 = a / b;
        int x5 = a % b;
        System.out.println("Expected output a+b : " + x1);
        System.out.println("Expected output a*b : " + x2);
        System.out.println("Expected output a-b : " + x3);
        System.out.println("Expected output a/b : " + x4);
        System.out.println("Expected output a%b : " + x5);

    }

    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);

        System.out.println("Input the first number");
        int a = java.nextInt();

        System.out.println("Input the second number");
        int b = java.nextInt();

        myMethod(a,b);
        java.close();
    }
}
