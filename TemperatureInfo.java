import java.util.ArrayList;
import java.util.Scanner;

/**
* Activity: Conditionals and Loops II.
* @author: Brandon Rose
* @version: 2/22/2024
**/

public class TemperatureInfo {

/**
* Array list.
* @param args - args for array list.
*/

   public static void main(String[] args) {
   
      ArrayList<Integer>tempList = new ArrayList<Integer>();
   
      Scanner userInput = new Scanner(System.in);
   
      String tempInput = "";
   
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
   
      Temperatures temps = new Temperatures(tempList);
      
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, "
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid Choice!");
         }
      } while (choice != 'E');
      userInput.close();
   }

}
