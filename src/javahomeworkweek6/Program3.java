
package javahomeworkweek6;

/*
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3 {
    int x = 10;
    static int y = 20;
    public void method1(){
        Program3 obj = new Program3();
        System.out.println(x);
        System.out.println(obj.y);
    }
    public static void method2(){
        Program3 obj = new Program3();
        System.out.println(obj.x);
        System.out.println(y);
    }
    public static void main(String[] args){
        method2();
        Program3 obj = new Program3();
        obj.method1();
    }
}

