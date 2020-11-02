package Project;

import java.util.ArrayList;

public class Customer_Methods {
    String itemsToShow = "";
    public Customer_Methods() {
    }
    //access to the stores?
    //store as an ArrayList ?


    public String listOfItems() {
        ArrayList<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        for (int i = 0; i< items.size(); i++) {
            itemsToShow = itemsToShow + items.get(i) + "; ";
        }
         return itemsToShow;
    }

    //public String checkout () {
     //   ArrayList<String> items = new ArrayList<>();
       // items.add("Item 1");
        //items.add("Item 2");
       // items.add("Item 3");

    }






