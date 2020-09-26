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






    }
}
