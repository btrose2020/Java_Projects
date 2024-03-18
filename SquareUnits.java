import java.util.Scanner;
/**
* Project: Square Units.
*
* @author Brandon Rose
* @version 1/26/2024
*
*/
public class SquareUnits {
/**
* Lists units used.
* @param args Command line arguments - not used.
*/  
   public static void main(String[] args) {
      int inches;
      int acres = 0, yards = 0, feet = 0;
      Scanner scanner = new Scanner(System.in);
   // User input:
      System.out.print("Enter the area in square inches: ");
      inches = scanner.nextInt();
   //if else statement 
      if (inches > 1000000000) {
         System.out.println("Limit of 1,000,000,000 "
            + "square inches exceeded!"); } 
      else {
         acres = (int) inches / 6272640;
         inches %= 6_272640;
         yards = (int) inches / 1296;
         inches %= 1296;
         feet = (int) inches / 144;
         inches %= 144;
         System.out.println("Number of Units: ");
         System.out.println("\tAcres: " + acres);
         System.out.println("\tSquare Yards: " + yards);
         System.out.println("\tSquare Feet: " + feet);
         System.out.println("\tSquare Inches: " + inches);
      }      
   }
}