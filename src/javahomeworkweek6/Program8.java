package javahomeworkweek6;
//Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Program8 {
    public static void area(int base, int height){
        int area = (base * height) / 2;
        System.out.println("'The Area of Triangle is : " + area);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of triangle : ");
        int base = scanner.nextInt();

        System.out.println("Enter the height of triangle :");
        int height = scanner.nextInt();
        area(base, height);

        scanner.close();
    }

}
