package Project;

import HomeWork9.From_The_Lab;

import java.util.*;

public class Customer {
   public static void main(String[] args) {
       Map<Integer, String> allStores = new HashMap<>(); //Store ID, Store name
       Map<Integer, String> allItemsStore1 = new HashMap<>(); // ItemID, Item name
       Map<Integer, Integer> store1 = new HashMap<>(); //<ItemID, quantity> - one of the stores
       Map<Integer, Integer> shoppingCart = new HashMap<>(); //should be static !
       Map<Integer, Double> prices = new HashMap<>(); //<ItemID, Price> - for the store?/mall?
        allStores.put(1,"Store 1");
        allStores.put(2, "Store 2");
        //Customer_Methods a1 = new Customer_Methods();
        //a1.listOfItems(store);
       //a1.placingToShoppingCart(store);
        //a1.accessToAllStores();
       System.out.println(allStores);

      Set<Integer> allStoreIDs = allStores.keySet(); //all keys
       List<Integer> allStoreIDsList = new ArrayList<>(allStoreIDs); //so we can take keys one by one
       Scanner scan = new Scanner(System.in);
       System.out.println("\tWelcome to Our Mall! \nPlease, choose the store to visit: ");
       try {
           for (int i = 0; i < allStoreIDsList.size(); i++) {
               String storeName = allStores.get(allStoreIDsList.get(i)); // value= name
               System.out.println(allStoreIDsList.get(i) + ". " + storeName); //first Id - corresponding name
           }
           System.out.println("Enter the store number: ");
           int storeID = scan.nextInt();
           String storeName = allStores.get(storeID);
           if (allStores.containsKey(storeID) == true) {
               System.out.println("Welcome to " + storeName + " !");
           } else {
               System.out.println("Enter a valid store number");
           }
       } catch (InputMismatchException e) {
         System.out.println("Invalid input");
      }
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid index value");
       } //finally {
           //scan.close();
       //}


    //store menu
       int option;
       //Collection <String> allItems = store1.values();
       //Scanner scan2 = new Scanner(System.in); ///change scan for methods 'scan'



       String storeMenu = "Please, select the option you would like to use : \n1. Display all items in this store." +
               "\n2. Place items into your shopping cart." +
               "\n3. Remove items from your shopping cart." +
               "\n4. Edit quantity of the item in your shopping cart." +
               "\n5. Go to check out.";
       System.out.println(storeMenu);
       option = scan.nextInt();

       try{
           if (option == 1) {
               System.out.println("Our store currently has these items: " + allItemsStore1); //need to be in stings
           } else if (option == 2) {
               System.out.println("How to connect with  placing method?");//should the method to plaace
           } else if (option == 3) {
               System.out.println("How to connect with 'remove' method?");//method to remove
           } else if (option == 4) {
               System.out.println("How to connect with 'edit' method?");//edit method
           }else if (option == 5) {
               System.out.println("How to connect with 'checkout' method?");//check out method
           } else {
               System.out.println("Please, enter a valid option number");
               int j = 0;
               do {
                   option = scan.nextInt();
                   j++;
               } while (j < 3); //how to get back to the store menu method? after the third attempt
           }
       } catch (NoSuchElementException e) {
           System.out.println("Please, enter a valid option number");
       }
       //catch (InputMismatchException e1) {
         //  System.out.println("Invalid input");
      // }
       //finally {
          // scan.close(); //need to be an option to get back to store menu
      // }

       //display list of the items

       //public void listOfItems (Map <Integer,String> allItemsStore1) {
        Collection<String> allItems = allItemsStore1.values(); //how it looks like?
        System.out.println(allItems);


        //option to place items to shopping cart
        //do we need multiple items option and what input(from a particular store)?
        //public void placingToShoppingCart (int itemID,int quantity) { //has to be item ID as an input + quantity or better ccheck through try{ ?
        //Scanner scan = new Scanner(System.in);
       int quantity = 0;
       try {
           System.out.println("Please, enter the item ID: ");
           int itemID = scan.nextInt();
           if (itemID > 0 && store1.containsKey(itemID) && store1.get(itemID) >= quantity) {
               shoppingCart.put(itemID, quantity);
               System.out.println("Currently in your shopping cart: \nItem:" + itemID + "\nQuantity: " + quantity);
           } else if (itemID > 0 && store1.containsKey(itemID) && store1.get(itemID) < quantity) {
               System.out.println("The item availability is limited. Current available quantity: " + store1.get(itemID) +
                       "\nIf you would like to enter a new quantity, please, use this menu: ");
               quantity = scan.nextInt(); //not sure how to exit
           } else {
               System.out.println("This store does not have this item. Please, check if the item number is correct.");
           }
       }catch (InputMismatchException e) {
        System.out.println("Please, enter a valid item ID");
        } finally {
        scan.close();
        }



        }







   }













