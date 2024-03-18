import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
* Project: Event.
*
* @author: Brandon Rose CPSC-1210-A01
*
* @version 2/3/2024
*/
public class Event {
/**
* Accepts user input.
* Based on coded event.
* Which contains date, time, price,
* section, row, and seat.
* Event description is also provided.
*
* @param args Command line arguments - not used.
*/
   public static void main(String[] args) { 
      String event = "";
      String description = "";
      String date = "";
      String day = "";
      String month = "";
      String year = "";
      String time = "";
      String hour = "";
      String minute = "";
      String section = "";
      String row = "";
      String seat = "";
      double price = 0;
      double discount = 0;
      double cost = 0;
      int prizeNumber;
   
   // user input
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your event code: ");
      String eventCode = "";
      eventCode = scan.nextLine().trim();
      if (eventCode.length() < 26) {
         System.out.print("\nInvalid Event Code."
               + "\nEvent code must have at "
               + "least 26 characters."); }
            
      else {
      // string location of each parameter
         date = eventCode.substring(0, 8);
         month = eventCode.substring(0, 2);
         day = eventCode.substring(2, 4);
         year = eventCode.substring(4, 8);
         time = eventCode.substring(8, 12);
         hour = eventCode.substring(8, 10);
         minute = eventCode.substring(10, 12);
         section = eventCode.substring(19, 21);
         row = eventCode.substring(21, 23);
         seat = eventCode.substring(23, 25);
         description = eventCode.substring(25);
         
      // calculations for price and cost after discount
         price = Double.parseDouble(eventCode.substring(12, 17)) / 100;
         discount = Double.parseDouble(eventCode.substring(17, 19)) / 100;
         
      // parameters and their associated values   
         System.out.print("\nEvent: " + description); 
         
         System.out.print("   Date: " + month + "/" + day + "/" + year);
         
         System.out.print("   Time: " + hour + ":" + minute);
         
         System.out.print("\nSection: " + section);
         
         System.out.print("   Row: " + row);
         
         System.out.print("   Seat: " + seat);
         
         
      // format for price values 
         DecimalFormat normalPrice = new DecimalFormat("$#,##0.00");
         DecimalFormat discountAmount = new DecimalFormat("0%");
         DecimalFormat discountPrice = new DecimalFormat("$#,##0.00");
        
      
      // prints formatted values
         System.out.print("\nPrice: " 
            + normalPrice.format(price));
            
         System.out.print("   Discount: " 
            + discountAmount.format(discount));
      
         cost = (price - (price * discount));
         System.out.print("   Cost: " 
            + discountPrice.format(cost));
      
      
      // prints random prize number
         Random randNumber = new Random();
         
         DecimalFormat randomFormat = new DecimalFormat("0000");
         
         int randNum = randNumber.nextInt(9999) + 1;
         System.out.print("\nPrize Number: " + randomFormat.format(randNum));   
      }
   }
}