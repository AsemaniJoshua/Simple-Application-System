package Package2;
import Package1.*;
public class Asub extends A{

    public static void main(String[] args){
        C c = new C();
        //System.out.println(c.defaultmessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedmessage);

       // System.out.println(c.privatemessage);
    }

}
