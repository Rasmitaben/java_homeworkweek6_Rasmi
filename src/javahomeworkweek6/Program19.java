package javahomeworkweek6;

import java.util.Scanner;

/**
 * 19.Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19 {
    public static void method1(String a1) {
        String b1 = a1.toLowerCase();
        System.out.println("convert the uppercase to lower case : " + b1);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string in to uppercase : ");
        String a1 = sc.nextLine();
        method1(a1);
        sc.close();
    }
}

