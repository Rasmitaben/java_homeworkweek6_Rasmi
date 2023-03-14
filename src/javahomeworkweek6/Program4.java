package javahomeworkweek6;

/*
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4 {
    int a = 5;
    int b = 10;
    static int x = 20;
    static int y = 40;
    public void method1(){
        Program4 obj = new Program4();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(a);
        System.out.println(b);
    }
    public static void method2() {
        Program4 obj = new Program4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Program4 obj = new Program4();
        method2();
        obj.method1();
    }


}
