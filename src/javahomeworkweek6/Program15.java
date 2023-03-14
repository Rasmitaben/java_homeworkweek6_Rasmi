package javahomeworkweek6;

//15. Write a Java program to swap two variables.


import java.util.Scanner;

public class Program15 {
    public int swapVariables(int x, int y){
        x = y;
        y = x;
        int result = x;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of x: ");
        int num1 = s.nextInt();

        System.out.println("Enter value of y: ");
        int num2 = s.nextInt();

        Program15 obj = new Program15();
        obj.swapVariables(num1, num2);
        obj.swapVariables(num2, num1);

        System.out.println("Swapped value of x : " + obj.swapVariables(num1, num2));
        System.out.println("Swapped value of y : " + obj.swapVariables(num2, num1));
        s.close();

    }
}
