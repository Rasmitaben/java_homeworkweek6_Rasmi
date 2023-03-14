package javahomeworkweek6;

import java.util.Scanner;

/*
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Program13 {
    public static void average(int a, int b, int c){
        int average = ((a + b + c) / 3);
        System.out.println("average value is : " + average);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = s.nextInt();
        System.out.println("Enter the second number :");
        int b = s.nextInt();
        System.out.println("Enter the third number :");
        int c = s.nextInt();
        average(a,b,c);
        s.close();
    }



}

