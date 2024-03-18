import java.util.ArrayList;

/**
* Activity: Conditionals and Loops II.
* @author: Brandon Rose
* @version: 2/22/2024
**/

public class Temperatures {
   private ArrayList<Integer>temperatures;

/**
* Initializes Temperatures obj w/ the given list of commands.
* @param temperaturesIn temps to be stored
**/
   
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      this.temperatures = temperaturesIn;
   }
    
/**
* Returns the lowest temp from given list.
* @return the lowest temp from list or 0 if list's empty.
**/ 
    
   public int getLowTemp() {
      if (temperatures.isEmpty()) { 
         return 0;
      }
    
      int low = temperatures.get(0);
      
      for (int i = 0; i < temperatures.size(); i++) { 
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
     
/**
* Returns lowest parameter.
* @param lowIn - the lowest value.
* @return the lowIn
**/
   
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp()?lowIn : getLowTemp();
   } 
   
/**
* Returns the high temp from list.
* @return the high temp.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
/**
* High temp value from given list.
* @param highIn - the highest temp from given list.
* @return the higher maximum number from list.
**/
   
   public int higherMaximum(int highIn) {
      return Math.max(highIn, getHighTemp());
   }
      
/** 
* Returns string of low and high temps.
* @return the string of low and high temps.
**/
   public String toString() {
      return "\tTemperatures: " + temperatures
               + "\n\tLow: " + getLowTemp()
               + "\n\tHigh: " + getHighTemp();
   }
}

    
