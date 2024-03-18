import java.util.Scanner;
/**
* Project: EllipsoidApp.
*
* @author Brandon Rose
* @version 2/11/2024
*
*/
public class EllipsoidApp {
/**
* Main method.
* @param args main method
*/ 
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("Enter label and axes a, b, c for an ellipsoid.\n\t");
      System.out.print("label: ");
      String label = scanner.nextLine();
   
      System.out.print("\ta: ");
      double a = Double.parseDouble(scanner.nextLine());
   
      if (a <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
   
      System.out.print("\tb: ");
      double b = Double.parseDouble(scanner.nextLine());
   
      if (b <= 0) {
         System.out.println("Error: axis value must be positive");
         return;
      }
   
      System.out.print("\tc: ");
      double c = Double.parseDouble(scanner.nextLine());
   
      if (c <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
   
      Ellipsoid ellipsoid = new Ellipsoid(label, a, b, c);
      System.out.println("\n" + ellipsoid);
   }
}