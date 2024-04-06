package Package1;
import Package2.*;
public class A {
     protected String protectedmessage = " This is protected";
    public static void main(String[] args){

        A a = new A();
        //System.out.println(a.defaultmessage);

        B b = new B();
        //System.out.println(b.defaultmessage);

        C c = new C();
        //System.out.println(c.defaultmessage);

        Asub asub = new Asub();
        //System.out.println(asub.defaultmessage);

        System.out.println(c.publicmessage);



        //System.out.println(asub.publicmessage);

        //System.out.println(c.defaultmessage);

        //System.out.println(c.defaultmessage);
    }
}
