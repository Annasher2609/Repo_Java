public class HomeWork1 {
    public static void main(String[] args) {
        byte numberOfHours = 24;
        System.out.println("There are " + numberOfHours + " hours in a day.");

        short maxNoOfDays = 366;
        System.out.println("Maximum number of days in a year is " + maxNoOfDays + ".");

        int totalNoOfEmployees = 33458;
        System.out.println("There are a total of " + totalNoOfEmployees + " employees in this organization.");

        long populationOfTheCountry = 19407468365243L;
        System.out.println("Population of the country is " + populationOfTheCountry + ".");

        float interestRate = 3.04f;
        System.out.println("The average rate for a 30-year fixed mortgage is " + interestRate + " percent.");

        double availableBalance = 56483.89;
        System.out.println("Your current account balance is " + availableBalance + "$.");

        boolean sunRise = false;
        System.out.println("Does the sun rise from the west?" + ' ' + sunRise + ".");

        char firstInitial = 'A';
        char secondInitial = 'S';
        System.out.println("My initials is " + firstInitial + secondInitial + ".");

        String myName = "Anna Shershneva";
        System.out.println("My name is " + myName + ".");



        byte km = 1; // 1 miles to km = 1.60934 km
        double mile = 1.609 * km;
        boolean is1MileEqTo1Km = km == mile;
        System.out.println("Is 1 km equal to 1 mile? "+ is1MileEqTo1Km);


        // 4 hours contain 14400 seconds ?


        int noOfHours = 4;
        int noOfSec = 14400;
        int noOfHoursToSecConv = noOfHours * 3600;
        boolean isNoOfHoursEqToNoOfSec = noOfHoursToSecConv == noOfSec;
        System.out.println("Do " + noOfHours + " hours contain " + noOfSec + " seconds? " + isNoOfHoursEqToNoOfSec);


        // find if given number is even
        int num = 10;
        int result = num % 2;
        int shouldBe = 0;

        boolean isEven = result == shouldBe;
        System.out.println("Is " + num + " even? " + isEven);

        /*
            code
            System.out.println(num + " is even number: " + isEven)
         */














    }
}
