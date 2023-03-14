package javahomeworkweek6;
/*
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2 {
    //Static variables - a and b are static variables
    static int a = 50;
    static int b = 100;
    //static method
    public static void addition() {
        System.out.println(a);
        System.out.println(b);
    }
    //Main method
    public static void main(String[] args) {
        addition();
    }

}





