import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {


         // I. Store your full name in a variable, and display the following:
         // 1. Display length of the first name.

        String fullName = "Anna Shershneva";
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0,indexOfSpace);
        int lengthFirstName = firstName.length();
        System.out.println("Length of my first name is: " + lengthFirstName + ".");

        //second way by string array

        String fName = "John Doe";
        String[] name2 = fName.split(" ");
        int fNameLength = name2[0].length();
        System.out.println("Length of name John is: " + fNameLength);
        boolean laNaStaK = name2[1].toUpperCase().startsWith("K");
        System.out.println("Does your last name starts with 'K'? " + laNaStaK);
        char firstNameAlph = name2[0].charAt(fNameLength -1);
        System.out.println("Last alphabet of the first name2 is: '" + firstNameAlph + "'.");
        boolean endsMLasN = name2[1].toUpperCase().endsWith("M");
        System.out.println("Does the last name end with 'M'? " + endsMLasN);




        // 2. Does your last name starts with "K" (Ignoring cases)

        String lastName = fullName.substring(indexOfSpace+1);
        boolean startsWithK = lastName.startsWith("K");
        System.out.println("Does my last name start with 'K'? " + startsWithK + ".");

         // 3. print the last alphabet of your first name

        char lastAlphFirstName = firstName.charAt(indexOfSpace - 1);
        System.out.println("The last alphabet of my first name is '" + lastAlphFirstName + "'.");

         // 4. Does your last name ends with "M" (Ignoring cases)

        String lastNameUpperCase = lastName.toUpperCase();
        boolean endsWithM = lastNameUpperCase.endsWith("M");
        System.out.println("Does my last name ends with 'M'? " + endsWithM + ".");


        // II. String myStatment = "I am a good programmer";
        //1. Display the total number of words in the myStatement.

        String statement = "I am a good programmer";
        String[] words = statement.split(" ");
        int lengthWords = words.length;
        System.out.println("Total number of words in the statement is " + lengthWords +".");


        //2. replace all the 'r' characters with 'f' characters.

        String replace_r_f = statement.replace('r','f');
        System.out.println("Replacing all 'r' with 'f', we will get: '" + replace_r_f +"'.");


        // III. Store your first name in a string variable.

        String myFirstName = "Anna";

        // Calculate the length of your first name, without using length() method of String class.
        int indexOf_a = myFirstName.indexOf("a");
        int lengthMyFirstName = indexOf_a + 1;
        System.out.println("Length of my first name is " + lengthMyFirstName + ".");

        // IV.String strNew = "hello dear, how are you?";
        //Assign result (boolean) as true if length of strNew if greater than 10
        // else assign false.

        String strNew = "hello dear, how are you?";
        int lengthStr = strNew.length();
        boolean result = lengthStr > 10?true:false;

        // print the result value.
        System.out.println(result);

        //V. String threeWordsSentence =  "hApPY nEW yeAr";
        // sout(threeWordsSentence);  // hApPY nEW yeAr
        // code
        // sout(threeWordsSentence);  // Happy New Year

        String threeWordsSentence = "hApPY nEW yeAr";
        System.out.println(threeWordsSentence);
        String[] afterSplit = threeWordsSentence.split(" ");

        String firstWord = afterSplit[0];
        String subFrom0First = firstWord.substring(0,1).toUpperCase();
        String subFrom1First = firstWord.substring(1).toLowerCase();
        firstWord = subFrom0First + subFrom1First;

        String secondWord = afterSplit[1];
        String subFrom0Second = secondWord.substring(0,1).toUpperCase();
        String subFrom1Second = secondWord.substring(1).toLowerCase();
        secondWord = subFrom0Second + subFrom1Second;

        String thirdWord = afterSplit[2];
        String subFrom0Third = thirdWord.substring(0,1).toUpperCase();
        String subFrom1Third = thirdWord.substring(1).toLowerCase();
        thirdWord = subFrom0Third + subFrom1Third;

        threeWordsSentence = firstWord + " " + secondWord + " " + thirdWord;
        System.out.println(threeWordsSentence);

        //VI. Create abbreviation:
        //String threeWordsSentence =  "Lab sessIONS clAsses";
        // code
        //LSC

        String threeWordsStatement = "Lab sessIONS clAsses";
        String[] oneByOne = threeWordsStatement.split(" ");
        String firstOne = oneByOne[0].substring(0,1).toUpperCase();
        String secondOne = oneByOne[1].substring(0,1).toUpperCase();
        String thirdOne = oneByOne[2].substring(0,1).toUpperCase();
        System.out.println(firstOne + secondOne + thirdOne);


        //from 09/28 class

        /**if name length is greater than 10 and number is greater than 5
                * print the below:
         *      name in all uppercase
         *      and replace p with b in name
                * else
         * make result as false
                *
         *
         * sout(result) // outside the if-else block*/

        String name = "Happy";
        boolean result1 = true;
        int number = 22;

        if (name.length()>10 && number>5) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace("p", "b"));
        } else {
        result1 = false;
         }
        System.out.println(result1);

        //based on month name, print season
        //         * dec, jab, feb -> winter
        //         * mar, apr, may -> summer
        //         * jun, jul, aug -> fall
        //         * sep, oct, nov -> spring
        //         * if invalid monthName, print invalid month entered
        //         */
        //        String monthName = "";

        String monthName = "tchjv";
        switch(monthName) {
            case "December":
                System.out.println("Winter");
                break;
            case "January":
                System.out.println("Winter");
                break;
            case "February":
                System.out.println("Winter");
                break;
            case "March":
                System.out.println("Summer");
                break;
            case "April":
                System.out.println("Summer");
                break;
            case "May":
                System.out.println("Summer");
                break;
            case "June":
                System.out.println("Fall");
                break;
            case "July":
                System.out.println("Fall");
                break;
            case "August":
                System.out.println("Fall");
                break;
            case "September":
                System.out.println("Spring");
                break;
            case "October":
                System.out.println("Spring");
                break;
            case "November":
                System.out.println("Spring");
                break;
            default:
                System.out.println("Invalid month");



        }

    }
}
