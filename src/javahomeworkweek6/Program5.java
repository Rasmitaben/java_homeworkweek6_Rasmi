package javahomeworkweek6;
/*
 Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)
 */
public class Program5{
    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.addition(10,5);
        obj.subtraction(10,5);
        obj.multiplication(10,5);
        obj.division(10,5);

    }
    public void addition(int a , int b) {
        int c = a + b;
        System.out.println("Addition : " + c);
    }
    public void subtraction(int a, int b){
        int c = a - b;
        System.out.println("subtraction : " + c );
    }
    public static void multiplication(int a, int b){
        int c = a * b;
        System.out.println("Multiplication :" + c);
    }
    public static void division(int a, int b) {
        int c = a / b;
        System.out.println("division :" + c);


    }

}






