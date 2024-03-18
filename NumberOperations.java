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
/*
* 
*
**/   
   public NumberOperations(int numberIn) {
      this.number = numberIn; 
   }

// getter method
   public int getValue() {
      return number;   
   }

// takes no parameters; returns a String   
   public String oddsUnder() {
      
      String output = "";
      int i = number;
      while (i < number) {
         if (i % 2 != 0) 
            output += i + "\t";
         i++;
      }
      return output;
   }

// takes no parameters; returns a String 
   public String powersTwoUnder() {
   
      int powers = 1;
      String output = "";
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }    
/**
* @param compareNumber to see comparison
* @return 1 if number is greater than compareNumber
* @return -1 if number is less than compareNumber
* @return 0 if number is equal to compareNumber
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