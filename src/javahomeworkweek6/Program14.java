package javahomeworkweek6;

import java.util.Scanner;

/*
 * Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.5 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Program14 {
    public static void rectangle(double w, double h){

        double perimeter = 2 * (w + h);
        double area = w * h;
        System.out.println(" Perimeter of rectangle is : " + perimeter);
        System.out.println("Area of rectangle is : " + area);
    }

    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);

        System.out.println("Area of rectangle is : ");
        double w = java.nextDouble();
        System.out.println("Perimeter of rectangle is : ");
        double h = java.nextDouble();
        rectangle(w,h);
        java.close();
    }
}
