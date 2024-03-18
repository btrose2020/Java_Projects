import java.text.DecimalFormat;

/**
* Project: Ellipsoid.
*
* Ellisoid class.
*
* @author Brandon Rose
* @version 2/11/2024
*/
public class Ellipsoid {
// declaration of instance variables
   private String label;
   private double a;
   private double b;
   private double c;
   
   
/**
* Constructor for default instance variables.
* @param label for ellipsoid is label	  	
* @param a parameter is a	  	
* @param b parameter is b	  	
* @param c parameter is c
*/
   public Ellipsoid(String label, double a, double b, double c) {
      setLabel(label);
      setA(a);
      setB(b);
      setC(c);
   }
/**
* Getter method for the label.
* @return label for getter 
*/
   public String getLabel() {
      return label;
   }
/**
* Getter method for the semi-axis b.
* @return label for setter
* @param label for setter
*/
   public boolean setLabel(String label) {
      if (label != null) {
         this.label = label.trim();
         return true;
      }
      return false;
   }
/**
* Getter method for the semi-axis a.
* @return label for getter 
*/
   public double getA() {
      return a;
   }
/**
* Setter method for the semi-axis a.
* @return label for setter 
* @param a for return method
*/
   public boolean setA(double a) {
      if (a > 0) {
         this.a = a;
         return true;
      }
      return false;
   }
/**
* Getter method for the semi-axis b.
* @return label for getter 
*/
   public double getB() {
      return b;
   }
/**
* Setter method for the semi-axis b.
* @return label for setter 
* @param b for return method
*/
   public boolean setB(double b) {
      if (b > 0) {
         this.b = b;
         return true;
      }
      return false;
   }
/**
* Getter method for the semi-axis c.
* @return label for getter 
*/
   public double getC() {
      return c;
   }
/**
* Getter method for the semi-axis c.
* @param c for setter 
* @return true or false based on value
*/
   public boolean setC(double c) {
      if (c > 0) {
         this.c = c;
         return true;
      }
      return false;
   }
/**
* Calculates volume.
* @return calculation for volume
*/
   public double volume() {
      return (4.0 / 3.0) * Math.PI * a * b * c;
   }
/**
* Calculates surface area.
* @return calculation for surface area
*/
   public double surfaceArea() {
      return (double) 4 * Math.PI * Math
                .pow(((Math.pow(a * b, 1.6) + Math.pow(a * c, 1.6) 
                + Math.pow(b * c, 1.6)) / (double) 3), (1 / 1.6)); 
   }
/**
* Overrides toString in order to output in decimal format.
*/
   @Override
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0###");
      return "Ellipsoid \"" + label + "\" with axes a = " 
               + format.format(a) + ", b = " 
               + format.format(b) + ", c = " 
               + format.format(c) + " units has:\n\t" 
               + "volume = " 
               + format.format(volume()) 
               + " cubic units\n\t" 
               + "surface area = " 
               + format.format(surfaceArea()) 
               + " square units";
   }
}
