package javahomeworkweek6;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Program10 {
    public static void multiplicationTable(int number){
        System.out.println("8 x 1 = " + 1* number);
        System.out.println("8 x 2 = " + 2* number);
        System.out.println("8 x 3 = " + 3* number);
        System.out.println("8 x 4 = " + 4* number);
        System.out.println("8 x 5 = " + 5* number);
        System.out.println("8 x 6 = " + 6* number);
        System.out.println("8 x 7 = " + 7* number);
        System.out.println("8 x 8 = " + 8* number);
        System.out.println("8 x 9 = " + 9* number);
        System.out.println("8 x 10 = " + 10* number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        multiplicationTable(number);
        scanner.close();


    }
}
