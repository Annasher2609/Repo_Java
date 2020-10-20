import java.util.Arrays;

public class Calculation {

    public static void main(String[] args) {
        MathLibrary ml = new MathLibrary();
        int sum = ml.addTwo(1,1);

        HomeWork7 a1 = new HomeWork7();
        boolean res = a1.isNumPrime(11);
        //System.out.println(res);

        double[] arr = {2.0, 3.5, 4.7};
        double vse = a1.addDoubles(arr);
        //System.out.println(vse);

        String msg = "madam";
        boolean isIt = a1.isPalindrome(msg);
       // System.out.println(isIt);

        /**String[] sent1 = {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
        String [] sent2 = {"hello", "grow", "laugh" , "peace"};
        //String abc = a1.commonValues(sent1, sent2);
        //System.out.println(abc);
        String[] given = {"hello", "peace", "happy" , "hello", "Happy", "hello"};
        Practice p1 = new Practice();
        String def = p1.findDuplicates(given);
        System.out.println(def);
        //String found = a1.duplicateValues(given);
        //System.out.println(found); // helo, happy, hello**/
        Practice p1 = new Practice();
        String msg5 = "have a great day ahead";
        int finalN = p1.numberOfV(msg5);
        //System.out.println(finalN);
        int [] sum67 = {1, 2, 2}; //5
        int[] sum672 = {1, 2, 2, 6, 99, 99, 7}; // → 5
        int [] sum673 = {1, 1, 6, 7, 2}; // → 4
        int summa = p1.sum672(sum67);
        //System.out.println(summa);
        String[] ex = {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
        String[] ex2 = {"hello", "grow", "laugh" , "peace"};
        String exRes =p1.printDoubles(ex, ex2);
        //System.out.println(exRes);
        int[] lucky13 ={0, 2, 4}; // → true
        int[] lucky132={1, 2, 3}; // → false
        int[] lucky133={1, 2, 4}; // → false
        boolean oneAndThree =p1.lucky13(lucky13);
        //System.out.println(oneAndThree);
        FirstTest ft = new FirstTest();
        int[] arr6 = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int num6 =24;
        int[] result6 = ft.removingInt(num6, arr6);
        //System.out.println(Arrays.toString(result6));
        int[] arr7={0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        int min = ft.missingSmallest(arr7);
        System.out.println(min);
        //int speed = 78;
        //ft.ticketingSystem(speed);



    }


}
