import java.util.Arrays;

public class Calculation {

    public static void main(String[] args) {
        MathLibrary ml = new MathLibrary();
        int sum = ml.addTwo(1,1);

        HomeWork7 a1 = new HomeWork7();
        boolean res = a1.isNumPrime(11);
        System.out.println(res);

        double[] arr = {2.0, 3.5, 4.7};
        double vse = a1.addDoubles(arr);
        System.out.println(vse);

        String msg = "madam";
        boolean isIt = a1.isPalindrome(msg);
        System.out.println(isIt);

        String[] sent1 = {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
        String [] sent2 = {"hello", "grow", "laugh" , "peace"};
        //String abc = a1.commonValues(sent1, sent2);
        //System.out.println(abc);
        String[] given = {"hello", "peace", "happy" , "hello", "Happy", "hello"};
        //String found = a1.duplicateValues(given);
        //System.out.println(found); // helo, happy, hello

        HomeWork8 b1 = new HomeWork8();
        b1.addToner(20);
        b1.printSummary();
        b1.addPages(40);
        b1.printSummary();
        b1.printDouble(20);
        b1.printSummary();
        b1.printSingle(7);
        b1.printSummary();
        b1.checkToner();
        b1.addToner(11);
        b1.checkToner();



    }


}
