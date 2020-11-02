package HomeWork9;

public class Restaurant {
    String restName;
    int capacity;
    int seatsOccupied;


    public Restaurant(String nameOfRestaurant, int guestCapacity) {
        restName = nameOfRestaurant;
        capacity = guestCapacity;
    }

    public int seatsAvailability() {
        if ((capacity - seatsOccupied) <= 0) {
            System.out.println("There are no available seats at this time");
        } else {
            System.out.println("Number of available seats is: ");
        } return capacity - seatsOccupied;
    }

    public void seatParty (int numberOfGuests) {
        if (numberOfGuests<=0 || numberOfGuests > (capacity - seatsOccupied)) {
            System.out.println("Number of guests is not correct or exceeds the restaurant's capacity");
        } else {
            seatsOccupied = seatsOccupied + numberOfGuests;
        }
    }

    public void removeParty (int numberOfGuests) {
        if (numberOfGuests>0 && numberOfGuests <= seatsOccupied) {
            seatsOccupied = seatsOccupied - numberOfGuests;
        } else {
            System.out.println("Number of guests is not correct or exceeds current number of guests");
        }
    }

    public void printSummary() {
        System.out.println("\nName: " + restName + "\nCurrent Guest Count: " + seatsOccupied + "\nGuest Capacity: " + capacity);
    }


        //     * 1. Create a method that tells user if the seats are available
        //     * 2. Create a method that seatsParty
        //     * 3. Create a method that removesParty
        //     * 4. Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity
        //     * 5. Create a method that printsRestaurantSummary
        //     *      Name:
        //     *      Current Guest Count:
        //     *      Guest Capacity:





    }


