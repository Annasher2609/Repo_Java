package HomeWork9;

import java.util.ArrayList;

public class RestaurantApp {
    public static void main(String[] args) {

        //Create a Restaurant class with attribute name, guestCapacity, guestCount
        Restaurant a1 = new Restaurant("Our Restaurant", 100);
        a1.seatParty(10);
       a1.seatParty(30);
       a1.removeParty(10);
       int num = a1.seatsAvailability();
        System.out.println(num);
        a1.printSummary();



        //From the lab
        ArrayList<String> arr = new ArrayList<>();


        From_The_Lab b1 = new From_The_Lab();
        String result = b1.returnStringMaxTimesOccurring(arr);
        System.out.println(result);

    }
}