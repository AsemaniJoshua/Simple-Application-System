import java.util.Scanner;

public class JavaClassWork {
    public static void main(String[] args){
        //System.out.println();
        //System.out.println("\t\t\t\tJ\t\t\t\t\tA\t\t\t\t\tV\t\t\t\t\t\tV\t\t\t\tA");
        //System.out.println("\t\t\t\tJ\t\t\t\tA\t\tA\t\t\t\t\tV\t\t\t\tV\t\t\t\tA\t\tA");
        //System.out.println("\tJ\t\t\tJ\t\t\tA\tA\tA\tA\tA\t\t\t\t\tV\t\tV\t\t\t\tA\tA\tA\tA\tA");
        //System.out.println("\t\tJ\tJ\t\t\tA\t\t\t\t\t\tA\t\t\t\t\tV\t\t\t\tA\t\t\t\t\t\tA");

        Scanner scanner = new Scanner(System.in);
        // Prompting the User
        System.out.println(" Please enter the value of a,b, and c for the following equation: ax^2 + bx + c");
        // Obtaining the value of a
        System.out.println("Please enter the value of a");
        int a=scanner.nextInt();
        // Obtaining the value of b
        System.out.println("Please enter the value of b");
        int b=scanner.nextInt();
        // Obtaining the value of c
        System.out.println("Please enter the value of c");
        int c=scanner.nextInt();
        // Calculating for the determinant
        int determinant;
        determinant = (b*b) - (4*a*c);
        // Displaying the determinant to the user
        System.out.println(" Your determinant from the values you entered is " + determinant);
        // Obtaining the root from the determinant
        if (determinant>0){
            System.out.println(" Two roots");
        }
        else if (determinant==0) {
            System.out.println(" One root");
        }
        else {
            System.out.println(" The equation has no real root");
        }


    }
}
