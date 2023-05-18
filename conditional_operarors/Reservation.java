package conditional_operarors;
/*
- Conditional-AND, &&, evaluates to true if the booleans on both sides are true.

- Conditional-OR, ||, evaluates to true if one or both of the booleans on either side is true.

- Logical-NOT, !, evaluates to the opposite boolean value to which it is applied.

*/


// a class used for reservation

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    

    // constructor method
    public Reservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
    } 

    // confirm reservation method
    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
			isConfirmed = false;
        }
    }
  
    // inform user method
    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }
  
    public static void main(String[] args) {

        // Create instances here

        Reservation partyOfEight = new Reservation(8, 20, true);
        Reservation partyOfFive = new Reservation(5, 3, true);


        System.out.println("Processing reservation for " + partyOfEight.guestCount);
        partyOfEight.confirmReservation();
        partyOfEight.informUser();
        System.out.println();


        System.out.println("Processing reservation for " + partyOfFive.guestCount);
        partyOfFive.confirmReservation();
        partyOfFive.informUser();
        System.out.println();
    
    }
}