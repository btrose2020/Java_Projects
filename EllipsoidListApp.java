
/**
* Project: EllipsoidListApp.
*
* @author Brandon Rose
* @version 2/17/2024
*
**/

public class EllipsoidListApp {
/**
* Main method.
* @param args for ellipsoid info
 **/  
   public static void main(String[] args) {
      
      // Created ellipsoid objects
      Ellipsoid ex1 = new Ellipsoid("Ex 1", 1, 2, 3);
      
      Ellipsoid ex2 = new Ellipsoid("Ex 2", 2.3, 5.5, 7.4);
      
      Ellipsoid ex3 = new Ellipsoid("Ex 3", 123.4, 234.5, 345.6);
      
      // Display created objects
      System.out.println(ex1.toString() + "\n");
      
      System.out.println(ex2.toString() + "\n");
      
      System.out.println(ex3.toString() + "\n");
   }     
}