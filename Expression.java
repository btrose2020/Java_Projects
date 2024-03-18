import java.util.Scanner;
/**
* Project: Expressions.
*
* @author Brandon Rose
* @version 1/26/2024
*
*/
public class Expression {
/** 
* Establishes expression and calculates.
* @param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      // x and y values declared
      Scanner userInput = new Scanner(System.in);
      
      String number = "";
      
      double xValue = 0;
      
      double yValue = 0;
      
      double result = 0;
      
      System.out.println("result = (10x + 32.6)(5y - 1.567) / xy");
      // Prompt user input
      System.out.print("\tx = ");
      
      xValue = userInput.nextDouble();
      
      System.out.print("\ty = ");
      
      yValue = userInput.nextDouble();
      
      if (xValue == 0 | yValue == 0) {
         System.out.println("result is \"undefined\"");
      }
      
      else {
         System.out.println("result = " + ((10 * xValue + 32.6)) 
            * ((5 * yValue - 1.567)) 
            / (xValue * yValue));
      }

   }
}
