import java.util.Arrays;

public class FirstTest {
    /**
     * Question 1:
     * * Create a method to return an int-array after removing a given int-value
     * * from a given int array.
     * *
     * * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * * Returned array: {32, 14, 98, 56, 148, 78}
     * *
     * * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

    public int[] removingInt(int num, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        int length = arr.length -count;
        int[] found ={} ;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num) {
                int index = j;
                for (int m = 0; m < j; m++) {
                    found[m] = arr[m];
                }
            }
        }return found;
    }
/**int[] results;

    for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                int index = i;
                results  = new int[arr.length-1];
                for (int j = 0; j < index; j++) {
                        results[j] = arr[0 + j];
            }
                for (int m = i; m< arr.length-1; m++) {
                    results[m] = arr[m+1];
                }
                System.out.println(Arrays.toString(results));
    }
        }
        return arr;
        }
 **/
/**
 ** Question 2:
 *          * Create a method to return missing smallest positive integer (greater than 0)
 *          * from given array.
 *          *
 *          * Example:
 *          * 	For array : {1, 3, 5, 4, 2, 7}
 *          * 	Method should return : 6
 *          *
 *          * 	For array : {-1, -3, 4, 2}
 *          * 	Method should return : 1
 *          *
 *          * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
 *          * 	Method should return : 4
 *          */


        public int missingSmallest ( int[] arr) {
            int smallest = 0;
            int min = 1;
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    min++;
                } else if (min != arr[i] ) {
                    smallest = min;
                }

            }return smallest;
        }

    /**
     ** Question 3:
     *          * Scenario: Traffic ticketing system
     *          * Write a method, that will print (not return) the points charged against
     *          * the license for over speeding.
     *          *
     *          *    1. Speed Limit = 70
     *          *    2. Every 5 miles over the speed limit will add 1 point
     *          *    3. If user gets 12 points for a speed then license is suspended
     *          *
     *          *  Example:
     *          *      user speed = 74 ; 0 points
     *          *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *          *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *          *      user speed = 178 ; 21 points (License suspended).
     *          *      user speed = 70 ; Thank you for driving within the speed limit.
     **/

    public void ticketingSystem ( double speed){
        int speedLimit = 70;
        double calculation = (speed - speedLimit) / 5;
        int points = (int) calculation;

        if (speed <= speedLimit) {
            System.out.println("Speed is within the speed limit");
        } else if (speed > speedLimit && speed < (speedLimit + 5)) {
            System.out.println("Driver has no points.");
        } else if (speed >= (speedLimit + 5) && points < 12) {
            System.out.println(" Driver has " + points + " points.");

        } else if (speed >= (speedLimit + 5) && points >= 12) {
            System.out.println("Driver has 12 points. The license is suspended.");
        }
    }




}













