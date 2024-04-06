package Package2;
import Package1.*;
public class C {

    String defaultmessage = " This is default";
   public String publicmessage = " This is public";

   private  String privatemessage = " This is private";

    public static void main(String[] args){
        C c = new C();
        //System.out.println(c.defaultmessage);

        Asub asub = new Asub();
        //System.out.println(asub.protectedmessage);

        // System.out.println(c.privatemessage);
    }





}
