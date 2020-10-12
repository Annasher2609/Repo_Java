import java.util.Arrays;

public class HomeWork7 {
    /*
     * 1. Create a method to add all the numbers in a array with double-values
     */
    public double addDoubles(double[] arr) {
        double total = 0.00;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    /*
    2. Create a method to verify if the input-int-number is prime or not
     * prime number: number divisible by 1 and itself
     * eg: 7 -> prime
     * 21 -> not a prime
     */
    public boolean isNumPrime(int num) {
        boolean res = false;
        if (num <= 1) {
            res = false;
        } else if (num == 2 || num == 3) {
            res = true;
        } else if (num % 2 == 0) {
            res = false;
        } else {
            for (int i = 3; i <= num; i += 2) {
                if (num % i == 0 && num != i) {
                    res = false;
                } else if (num % i == 0)
                    res = true;
            }
        }
        return res;
    }

    /*
    3. Create a method to find if given string is palindrome.
     * Palindrome: string which reads the same in reverse.
     * racecar  ->  racecar
     * level    ->  level
     */
    public boolean isPalindrome(String msg) {
        String reverse = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            reverse = reverse + msg.charAt(i);
        }
        boolean res = reverse.equalsIgnoreCase(msg);
        return res;
    }

        /*
        5. Write a method to print(no return) the common values between two arrays (string arrays)
     * Input arrays:
     *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
     *  arr2 -> {"hello", "grow", "laugh" , "peace"}
     * Method should print -> hello, peace, laugh
         */
    /**
     * Deepak, i dont know, if i can even use "null", but i was basically
     * trying to get rid of duplicates. Sure, there is the other way, but
     *
     * I decided to try "null", and it looks like it worked)
**/
    public void commonValues(String[] arr1, String[] arr2) {
        String res = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    res = res + arr1[i] + " ";
                    arr2[j] = null;
                }
            }
        } System.out.println(res);
    }

    /* 4. Write a method to print(no return) the duplicate values in a given String array.
     * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
     * Method should print -> hello, happy
     * hello
     * happy
     */
    /**
     * Here Im officially giving up)) Wanted to work without duplicating
     * the string. So started to compare first value with second
     * and further. Then, before adding the result to the final value,
     * I wanted to check if other duplicate already exists in the
     * string with final values. But, for some reasons, im still left
     * with duplicates in the final string.
     
   **/
    public void duplicateValues(String[] arr) {
        String duplicates = "";
        String[] addition = duplicates.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    for (int m = 0; m < addition.length; m++) {
                        if (addition[m].equalsIgnoreCase(arr[j])) {
                            break;
                        } else {
                            duplicates = duplicates + arr[j] + " ";
                        }
                        break;
                    }
                    break;
                }
            }
        }
        System.out.println(duplicates);

    }
}

























