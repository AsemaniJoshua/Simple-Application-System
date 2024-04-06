import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MyMTNXtraTimeWithFunctions {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x;
        String code;

            // trying all codes to see if there is an exception

        try{

                code = JOptionPane.showInputDialog("    Enter MTN Xtra Time code");

                // comparing code

            if (code.equals("*506#")){

                //displaying first content of the Xtra Time
                x= Integer.parseInt(JOptionPane.showInputDialog("    Welcome to MTN Xtra Time \n\n" +
                        " Please select an option: \n" +
                        " 1. 5.00 GHC \n" +
                        " 2. 4.00 GHC \n" +
                        " 3. More advance option \n" +
                        " 4. Request a data advance \n" +
                        " 5. Menu "
                ));
                    // if the user select an option 1
                if (x==1){

                    x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 5.00 GHC. \n" +
                                " 5.50 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        action(x,5);

                }
                    // if the user select an option 2
                else if (x==2){

                    x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 4.00 GHC. \n" +
                            " 4.40 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                            " 1. Confirm \n" +
                            " 2. Cancel \n"
                    ));

                    // if the user want to confirm or not
                    action(x,4);

                }
                       // if the user select an option 3
                else if (x==3){

                    x= Integer.parseInt(JOptionPane.showInputDialog("    Welcome to MTN Xtra Time \n\n" +
                            " Please select an option: \n" +
                            " 1. 5.00 GHC \n" +
                            " 2. 4.00 GHC \n" +
                            " 3. 3.00 GHC \n" +
                            " 4. 2.00 GHC \n"
                    ));
                          // if the user select 1
                    if (x==1) {

                        x = Integer.parseInt(JOptionPane.showInputDialog("    You have selected 5.00 GHC. \n" +
                                " 5.50 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        action(x,5);

                    }
                         // if the user select 2
                    else if (x==2){

                        x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 4.00 GHC. \n" +
                                " 4.40 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        action(x,4);
                    }
                            // if the user select 3
                    else if (x==3){

                        x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 3.00 GHC. \n" +
                                " 3.30 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        action(x,3);

                    }
                          // if the user select 4
                    else if (x==4){

                        x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 2.00 GHC. \n" +
                                " 2.20 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        action(x,2);

                    }

                    else {

                        JOptionPane.showMessageDialog(null,"    Wrong input\n" +
                                "    Try again");
                    }

                }
                       // if the user select an option 4
                else if (x==4){

                    x= Integer.parseInt(JOptionPane.showInputDialog("    Welcome to MTN Xtra Time \n\n" +
                            " Please select an option: \n" +
                            " 1. 514 MB \n" +
                            " 2. 402 MB \n" +
                            " 3. 98 MB \n" +
                            " 4. 41 MB \n"
                    ));
                            // if the user select 1
                    if (x==1) {

                        x = Integer.parseInt(JOptionPane.showInputDialog("    You have selected 514 MB. \n" +
                                " 5.50 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        if (x == 1) {

                            JOptionPane.showMessageDialog(null, "    514 MB has been added to your bundle. \n\n"
                                    + "     The amount of 5.50 GHC will be deducted from your next reload.");
                        } else {
                            JOptionPane.showMessageDialog(null, "    Cancelled.");
                        }

                    }
                           // if the user select 2
                    else if (x==2) {

                        x = Integer.parseInt(JOptionPane.showInputDialog("    You have selected 402 MB. \n" +
                                " 4.40 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        if (x == 1) {

                            JOptionPane.showMessageDialog(null, "    402 MB has been added to your bundle. \n\n"
                                    + "     The amount of 4.40 GHC will be deducted from your next reload.");
                        } else {
                            JOptionPane.showMessageDialog(null, "    Cancelled.");
                        }

                    }
                          // if the user select 3
                    else if (x==3){

                        x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 98 MB. \n" +
                                " 3.30 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        if (x==1){

                            JOptionPane.showMessageDialog(null,"    98 MB has been added to your bundle. \n\n"
                                    + "     The amount of 3.30 GHC will be deducted from your next reload.");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"    Cancelled.");
                        }

                    }
                           // if the user select 4
                    else if (x==4){

                        x=Integer.parseInt(JOptionPane.showInputDialog("    You have selected 41 MB. \n" +
                                " 2.20 GHC will be deducted from your next airtime reload or MoMo bundle purchase \n" +
                                " 1. Confirm \n" +
                                " 2. Cancel \n"
                        ));

                        // if the user want to confirm or not
                        if (x==1){

                            JOptionPane.showMessageDialog(null,"    41 MB has been added to your bundle. \n\n"
                                    + "     The amount of 2.20 GHC will be deducted from your next reload.");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"    Cancelled.");
                        }

                    }

                    else {

                        JOptionPane.showMessageDialog(null,"    Wrong input\n" +
                                "    Try again");
                    }

                }
                     // if the user select an option 5
                else if (x==5){

                    x= Integer.parseInt(JOptionPane.showInputDialog("     MTN Xtra Time \n\n" +
                            " Please select an option: \n" +
                            " 1. Status \n" +
                            " 2. Info \n" +
                            " 3. Outstanding Credit \n" +
                            " 4. History \n"
                    ));
                         // if the user select 1
                    if (x==1){

                        JOptionPane.showMessageDialog(null,"    Y'ello. You are eligible for Xtra Time service. \n"
                         + "    You can dial *506# and request an airtime or data advance anytime.");
                    }
                        // if the user select 2
                    else if (x==2){

                        JOptionPane.showMessageDialog(null,"    Y'ello. \n" +
                                "    If you are eligible for Xtra Time service, you can request an airtime or data advance when your balance runs low. \n"
                                + "    Just dial *506#.");
                    }
                        // if the user select 3
                    else if (x==3){

                        JOptionPane.showMessageDialog(null,"    Y'ello. \n" +
                                "    Your current pending credit for MTN Xtra Time is zero. \n"
                                + "    Dial *124# to know your balance. \n" +
                                "    You can dial *506# and request Xtra Time anytime.");
                    }
                       // if the user select 4
                    else if (x==4){

                        JOptionPane.showMessageDialog(null,"    Y'ello. \n" +
                                "    Your request is being processed. \n"
                                + "    You will receive an SMS notification soon.");
                    }

                    else {

                        JOptionPane.showMessageDialog(null,"    Wrong input\n" +
                                "    Try again");
                    }

                }

                else {

                    JOptionPane.showMessageDialog(null,"    Wrong input\n" +
                            "    Try again");
                }

            }

            else {
                JOptionPane.showMessageDialog(null,"    Connection problem or invalid MMI code");
            }


        }
        catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null,
                    "    Please enter a number and not letter(s) \n\n" +
                            "    Thank you."
            );
        }

        catch (Exception e){

            JOptionPane.showMessageDialog(null,
                    "                 Oops!!!  \n" + " Something went wrong"
            );
        }

        finally {

            JOptionPane.showMessageDialog(null,
                    "     Thank you for using MTN  "
            );
            scanner.close();

        }



    }

    static void action(int x, int a){

        double num = a + (0.1*a);
        if (x==1){

            JOptionPane.showMessageDialog(null,"    The amount of " + a + ".00 GHC has been added to your account. \n\n"
                    + "     The amount of " + num + "0 GHC will be deducted from your next reload.");
        }
        else {
            JOptionPane.showMessageDialog(null,"    Cancelled.");
        }
    }
}
