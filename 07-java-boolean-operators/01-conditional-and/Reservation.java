public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if(restaurantCapacity >= guestCount && isRestaurantOpen){
        isConfirmed = true;
        System.out.println("Reservation confirmed");
      } else {
        isConfirmed = false;
        System.out.println("Reservation denied");
      }
    }
    
    public void informUser() {
      System.out.println("Please enjoy your meal!");
    }
    
    public static void main(String[] args) {
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
  }