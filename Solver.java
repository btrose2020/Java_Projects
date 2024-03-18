import java.util.Scanner;
import java.text.DecimalFormat;
 /**
 * Project: Solver.
 *
 * @author: Brandon Rose CPSC-1210-A01
 *
 * @version 2/3/2024
 */
public class Solver {
 /**
 * Solves an expression.
 * @param args Command line arguments - not used.
 */ 
   public static void main(String[] args) {
   
      Scanner xValue = new Scanner(System.in);
      System.out.print("Enter a value for x: "); // input x value
      
      double x = xValue.nextDouble();
      // calculation
      double numerator = Math.sqrt(11 * Math.pow(x, 4)     
         + 9 * Math.pow(x, 3) + 7 * Math.pow(x, 2)                    
         + 5 * x + 4);
                         
      double denominator = 2 * x + 4;
      
     
      if (denominator == 0) { // check for division by zero
         System.out.println("Error: Division by zero");  
         
      } else {
         double result = numerator / denominator;
         
         // convert double to string 
         String resultString = Double.toString(result); 
         
         // digit identifier
         int digitLocation = resultString.indexOf("."); 
         
         // calculates # of digits to L and R 
         int digitL = digitLocation;  
         int digitR = resultString.length() - digitLocation - 1;
         
         // prints decimal formats and strings
         
         DecimalFormat decimalFormat = new DecimalFormat("#,##0.0####");
         
         String formattedResult = decimalFormat.format(result);
         
         System.out.println("Result: " 
               + result);
                     
         System.out.println("# of characters to left of "
               + "decimal point: " + digitL);
               
         System.out.println("# of characters to right "
               + "of decimal point: " + digitR);
               
         // prints formatted results
         
         System.out.println("Formatted Result: " + formattedResult);  
      }    
   }
}
