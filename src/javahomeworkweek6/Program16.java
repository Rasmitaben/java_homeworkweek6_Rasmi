package javahomeworkweek6;

import java.util.Scanner;

/*
 * Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */

public class Program16 {
    public static void myMethod(String a, String b){
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int num3 = num1 + num2;

        System.out.println("num1 : "+Integer.toBinaryString(num1));
        System.out.println("num2 : "+Integer.toBinaryString(num2));
        System.out.println("num3 = num1+num2 : "+Integer.toBinaryString(num3));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first Binary number : ");
        String a = s.next();
        System.out.println("Enter second Binary number : ");
        String b = s.next();
        myMethod(a,b);
        s.close();

    }
}
