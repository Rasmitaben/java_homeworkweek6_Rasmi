package javahomeworkweek6;
/*
 *1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1 {
    // Instance variables = Name and Age are instance variables
    String name = "Tanavi";
    int age = 25;

    //No return type no params method
    public void method1() {
        Program1 obj = new Program1();
        //instance variables inside the instance method and inside the print statement
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    // Main method
    public static void main(String[] args) {
        //Instance method into main method
        Program1 obj = new Program1();
        obj.method1();

    }
}




