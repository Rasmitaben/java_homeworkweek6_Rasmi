package javahomeworkweek6;

import java.util.Scanner;

/*
 * 17. Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */


public class Program17 {
    public static void method1(int a){
        String binary = Integer.toBinaryString(a);
        System.out.println(a + "in decimal = " + binary + " in binary.");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number");
        int a = sc.nextInt();
        method1(a);
        sc.close();

    }
}
