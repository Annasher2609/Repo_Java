package Project;

import java.util.*;

//public class Customer_Methods {
    /**Map<Integer, String> allStores = new HashMap<>(); //Store ID, Store name
    Map<Integer, String> allItemsStore1 = new HashMap<>(); // ItemID, Item name (planed for the mall, but for store1
    Map<Integer, Integer> store1 = new HashMap<>(); //<ItemID, quantity> - one of the stores
    Map<Integer, Integer> shoppingCart = new HashMap<>(); //should be static !
    Map<Integer, Double> prices = new HashMap<>(); //<ItemID, Price> - for the store?/mall?

    //after log in
    public void accessToAllStores() {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index value");
        } finally {
            scan.close();
        }
    }



    public void visitingStoreMenu() {
        int option;                     //any inputs ?
        Collection <String> allItems = allItemsStore1.values();

      String storeMenu = "Please, select the option you would like to use : \n1. Display all items in this store." +
              "\n2. Place items into your shopping cart." +
              "\n3. Remove items from your shopping cart." +
              "\n4. Edit quantity of the item in your shopping cart." +
              "\n5. Go to check out.";
        System.out.println(storeMenu);
      Scanner scan = new Scanner(System.in);
      option = scan.nextInt();

        try{
            if (option == 1) {
                System.out.println("We currently have these items at our store: " + allItems); //need to be in stings
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
        } finally {
            scan.close(); //need to be an option to get back to store menu
        }
    }


    //display list of the items
    public void listOfItems (Map<Integer,String> allItemsStore1) {
        Collection<String> allItems = allItemsStore1.values(); //should be in string. get it done
        System.out.println(allItems);
    }

    //option to place items to shopping cart
    public void placingToShoppingCart (int itemID,int quantity) { //has to be item ID as an input + quantity or better ccheck through try{ ?
        Scanner scan = new Scanner(System.in);
        try {     //or just take from the input?
            System.out.println("Please, enter the item ID: ");
            itemID = scan.nextInt();
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
        } catch (InputMismatchException e) {
            System.out.println("Please, enter a valid item ID");
        } finally {
            scan.close();
        }
    }
////////////////////////////
    //Option to remove items from shopping cart (from log in level?)
   public void removingFromShoppingCart (int itemID, int quantity) { //has to be itemID
        //System.out.println("Currently in your sopping cart: " + shoppingCart);
        Scanner scan1 = new Scanner(System.in);
        try {
            System.out.println("Please, enter the item ID: ");
            int itemID = scan1.nextInt();
            if (itemID>0 && itemID <shoppingCart.size() && shoppingCart.containsKey(itemID)==true) {
                String removed = shoppingCart.remove(itemID);
                System.out.println(removed + " has been removed from your shopping cart");
            } else {
                System.out.println("Please, enter a valid item ID");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, enter a valid item ID");
        } catch (NoSuchElementException e1) {
            System.out.println("This item was not found in your cart. Please, enter a valid item ID");
        }
        finally {
            scan1.close();
        }
    }

   //Option to edit quantity of items in cart, if there is an available quantity of items in cart
    public void editQuantityInCart (int itemID, int num){

            }




   int item1Quantity;


    // checkout menu



    //option to check out
    //!take prices from Store Owner

  double taxRate = 0.009;
    double ccFee = 0.03;
    double ppFeePercentage = 0.025;
    double ppFeeAddition = 0.35;
    double priceFinal;
    String receipt =;

    public void checkout (int itemID, int quantity) {
        int i=0;
        int quantityInCart =0;
       try {
           while (i<=quantity ) {
               if (store1.containsKey(itemID) == true && quantity>0) {
                   String removedId = store1.remove(itemID);
                   item1Quantity --;
                   quantityInCart ++;

               } else if (store1.containsKey(itemID) == false && quantity>0) {
                   System.out.println("Unfortunately, this item is sold out or the required amount exceeds the available stock. \nCurrent amount of the item on your cart: " + quantityInCart );
               } else {
                   System.out.println("Please, enter a valid item amount");
               }
               i++;
           }
           double priceForItem = prices.get(itemID);
           double addedTax = priceForItem * quantity * taxRate;
           double priceWithTax = priceForItem + addedTax;
           double ccAdded = priceWithTax * ccFee;
           double ppAdded = priceWithTax * ppFeePercentage + ppFeeAddition;
           System.out.println("Please, select your payment method: \n\t1 for Credit Card \n\t2 for Paypal");
           Scanner scan = new Scanner(System.in);
           String paymentMethod = scan.next();
           if (paymentMethod=="1"){
               priceFinal = priceWithTax + ccAdded;
               receipt = receipt + "Thank you for your purchase! " +
                       "\n\tYour purchase amount is: $" + priceFinal +
                       "\n\tIncluding: item " + store1.get(itemID) + " x " + quantityInCart +
                       "\n\tTax: " + addedTax +
                       "\n\tCredit cart fees: " + ccAdded +
                       "\nStore Name \nMall Name";
           } else if ( paymentMethod == "2") {
               priceFinal = priceWithTax * ppAdded;
               receipt = receipt + "Thank you for your purchase! " +
                       "\n\tYour purchase amount is: $" + priceFinal +
                       "\n\tIncluding: item " + store1.get(itemID) + " x " + quantityInCart +
                       "\n\tTax: " + addedTax +
                       "\n\tPaypal fees: " + ppAdded +
                       "\nStore Name \nMall Name";
           } else {
               System.out.println("Please, enter a valid payment method");
           }
       } catch (InputMismatchException e) {
           System.out.println("Please, enter a valid value");
       }catch (ArithmeticException e) {
           System.out.println("Please, enter a valid value");
       }
    }
    }

//scan (log in)
//access to the stores ( Map <storeID,name of the store> ):
//show all values (collection <>) - names of stores
//option to visit a store;
//scan (Enter the store (ID (key) ) )
//-> get(ID) - show the name of the store
//for the particular store
// should be a method using an object / var from the other class?

//creating the store with an option to add (item ID, item)
//should be connected to:
// Store Owner (add/ remove items; create/close store; have sale)
// Mall Owner ( view store inventory; close the store)
// Map<Integer,String> store1 = new HashMap<>();
// Map <item ID, Item 1>**/





