package javahomeworkweek6;
//Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Program9 {
    public static void method(String a){
        String b = a.toLowerCase();
        System.out.println( "convert the uppercase to lower case : " + b);


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name in a upper case: ");
        String a = scanner.nextLine();
        method(a);
        scanner.close();
    }
}
