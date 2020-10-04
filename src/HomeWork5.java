import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {

        //I. Returned abbreviation for any string
        /**
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         *  String abr = "";
         * //code
         * sout("Abbreviation : " + abr);
         */
        String msg = "have happy and prosperous life";
        String[] oneByOne = msg.toUpperCase().split(" ");
        String abr = "";
        for (int i=0; i< oneByOne.length; i++) {
                abr = abr + oneByOne[i].substring(0, 1);
                }
        System.out.println("Abbreviation: " + abr);



        //II. Change the string to title case
        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line (Before modification) : " + line);
        String[] afterSplit = line.split(" ");
        String zero = "";
        for (int i=0; i< afterSplit.length; i++) {
            zero = zero + (afterSplit[i].substring(0, 1).toUpperCase() + afterSplit[i].substring(1).toLowerCase() +" ");
        }
        System.out.println("Line (After modification) : " + zero);



        //III. reverse a string
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        for (int i=message.length()-1; i>= 0; i--) {
            reverseMessage = reverseMessage + message.charAt(i);
        }
        System.out.println("Message in reverse: " + reverseMessage);
















    }







    }













