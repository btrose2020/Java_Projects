/**
* Activity 2: Comparable Interface.
* @author: Brandon Rose
* @version: 3/21/2024
**/ 
public class Customer {
   private String name;
   private String location;
   private double balance;

/**
* Constructor.
* 
* @param nameIn name of customer.
**/
   public Customer(String nameIn) {
      this.name = nameIn;
      this.location = "";
      this.balance = 0;
   }

/**
* Sets customer location. 
* @param locationIn of customer.
**/
   public void setLocation(String locationIn) {
      this.location = locationIn;
   }

/**
* Changes customer balance amount.
* @param amount of customer balance.
**/
   public void changeBalance(double amount) {
      this.balance += amount;
   }

/**
* Gets customer's location.
* @return the customer's location.
**/
   public String getLocation() {
      return this.location;
   }

/**
* Returns customer balance as a double type.
* @return the customer's balance. 
**/
   public double getBalance() {
      return this.balance;
   }

   @Override
   public String toString() {
      return this.name + "\n" + this.location + "\n" + "$" + this.balance;
   }

/**
* Overload setLocation method.
* @param city of customer.
* @param state of the customer.
**/
   public void setLocation(String city, String state) {
      this.location = city + ", " + state;
   }

/**
* Returns customer's info as a String.
* @param args - not used.
**/
   public static void main(String[] args) {
      Customer cstmr = new Customer("Lane, Jane");
   
      cstmr.setLocation("Boston, MA");
      System.out.println(cstmr.getLocation());
   
      // city, state are 2 params below
      cstmr.setLocation("Omaha", "NE");
      System.out.println(cstmr.getLocation());
   
      System.out.println();
      cstmr.setLocation("Boston, MA");
      cstmr.changeBalance(5);
      System.out.println(cstmr);
   }
}