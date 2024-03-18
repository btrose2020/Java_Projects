/**
*
* Project: Number Operations.
* @author: Brandon Rose
* @version: 2/14/2024
*
**/
public class NumberOperations {
   private int number; 

// constructor method for class
/**
* Brings in number integer.
* @param numberIn is used for methods.
**/   
   public NumberOperations(int numberIn) {
      this.number = numberIn; 
   }

// getter method
/**
* Get value; return as a number.
* @return getValue as a number.
**/
   public int getValue() {
      return number;   
   }

// takes no parameters; returns a String 
/**
* Establishes String output for odds.
* @return odds as a String
**/  
   public String oddsUnder() {
      
      String output = "";
      int i = number;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }

// takes no parameters; returns a String 
/**
* Powers to under method.
* @return powersTwoUnder based on integer value.
**/
   public String powersTwoUnder() {
   
      int powers = 1;
      String output = "";
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }    
/**
* Greater than, less than or equal to.
* @param compareNumber to see comparison
* @return -1, 0, 1 based off compareNumber
*/
   public int isGreater(int compareNumber) {
   
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }    
   }
   
   @Override
   public String toString() {
      return number + "";
   }
}