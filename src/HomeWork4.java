public class HomeWork4 {
    public static void main(String[] args) {
        /* I.Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         * (score/max)*100
        calculate percentage
        your percentage: XX.yy and your grade is: A
         */

        int stuScore = 99;
        int maxScore = 100;
        int percentage = (stuScore * 100) /maxScore;
        if (percentage <= 100 && percentage >= 91) {
            System.out.println("Your percentage: " + percentage + ". And your grade is: A.");
        } else if (percentage <= 90 && percentage >= 81) {
            System.out.println("Your percentage: " + percentage + ". And your grade is: B.");
        }else if (percentage <= 80 && percentage >= 71) {
            System.out.println("Your percentage: " + percentage + ". And your grade is: C.");
        }else if (percentage <= 70 && percentage >= 61) {
            System.out.println("Your percentage: " + percentage + ". And your grade is: D.");
        }else if (percentage <= 60 && percentage >= 51) {
            System.out.println("Your percentage: " + percentage + ". And your grade is: E.");
        }else if (percentage <= 50 && percentage >= 0) {
            System.out.println("Your percentage: " + percentage + ". And your grade is: F.");
        }else {
            System.out.println("Entered score is not correct");
        }

        // II. store value in an int variable
        //         * if number is divisible by 3, print "divisible by 3"
        //         * if number is divisible by 5, print "divisible by 5"
        //         * if number is divisible by 3 and 5, print "divisible by both"
        //         * if not divisible by 3 or 5, print the number

        //if the order of the operations is not important:
        int number = 15;
        if (number %3 == 0 && number %5 == 0) {
            System.out.println("Divisible by both");
        } else if (number %3 == 0) {
            System.out.println("Divisible by 3.");
        } else if (number %5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println(number);
        }
        // OR, keeping the given order:

        int number2 = 30;
        if (number2 %3 == 0 && number2 %5 != 0) {
            System.out.println("Divisible by 3");
        } else if (number2 %5 == 0 && number2 %3 != 0) {
            System.out.println("Divisible by 5");
        } else if (number2 %3 == 0 && number2 %5 ==0) {
            System.out.println("Divisible by both");
        } else {
            System.out.println(number2);
        }


        /* III. Checking car mode (P, D, N, R)   // switch
              * if car mode is P and "you can park car"
              * if car mode is D drive car
              * if drive type is Snow, display "You are on Snow mode"
              * if drive type is Sport, display "You are on Sport mode"
              * if drive type is Eco, display "You are on Eco mode"
              * if car mode is N you can "put car in car wash"
              * if car mode is R you can "revere the car"
              */
        //        char gear = 'D';
        //        String cMode = "Eco";  // Snow, Sport or Eco
        //        // code

        char carMode = 'D';
        String driveType = "Eco";

        switch (carMode) {
            case 'P':
                System.out.println("You can park car");
                break;
            case 'D':
                System.out.println("Drive car");
                if (driveType == "Snow") {
                    System.out.println("You are on 'Snow mode'");
                } else if (driveType == "Sport") {
                    System.out.println("You are on 'Sport mode'");
                } else if (driveType == "Eco") {
                    System.out.println("You are on 'Eco mode'");
                }
                break;
            case 'N':
                System.out.println("Put car in car wash");
                break;
            case 'R':
                System.out.println("Reverse the car");
                break;
        }




        String[] otherNames = {"Happy", "Peace", "Joy", "Laugh"};

        for (int i=0 ; i<= otherNames.length-1 ; i++) {
            if (i%2 == 0) {
        System.out.println(otherNames[i]);
            }
        }
        //or

        for (int i=0 ; i<otherNames.length ; i+=2) {
            System.out.println(otherNames[i]);

        }

        int abc = 10;
        for ( int i =10; i >=1; i--) {
            System.out.println(i);
        }

        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // print all values from array using for-loop, enhanced-for loop and while-loop

        for (int i=0; i< alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }

        for (char letters : alphabets) {
            System.out.println(letters);
        }

        int j=0;
        while (j<alphabets.length) {
            System.out.println(alphabets[j]);
            j++;
        }

        String exp = "happy";
        for (int i= 1; i<= exp.length(); i++) {
            System.out.print(exp.charAt(exp.length()-i));
        }

        String[] uy = exp.split("");
        for (int i=exp.length()-1; i>= 0; i--) {
            System.out.print(uy[i]);
        }



    }
}
