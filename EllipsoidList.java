import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Ellipsoid List Class.
* This class stores the name.
* of the list and an ArrayList of
* Ellipsoid objects.
* @author: Brandon Rose
* @version: 2/25/2024
**/
public class EllipsoidList {

   private String ellipsoidName;
   private ArrayList<Ellipsoid> eList;
   
/** 
* Methods that provide the name of the list,
* the count of Ellipsoid objects 
* within the EllipsoidList,
* the total volume & surface area 
* of all Ellipsoid objects,
* the average volume & surface area across 
* all Ellipsoid objects in the EllipsoidList.   
* @param eListIn for eList
* @param ellipsoidNameIn for ellipsoid name int
**/

   public EllipsoidList(String ellipsoidNameIn, ArrayList<Ellipsoid> eListIn) {
      ellipsoidName = ellipsoidNameIn;
      eList = eListIn;
   }
    
/** 
* Getter for ellispoid String name.
* @return the Ellipsoid name
**/

   public String getName() {
      return ellipsoidName;
   }
   
/** 
* Returns number of ellipsoids.
* @return the number of Ellipsoids
**/

   public int numberOfEllipsoids() {
      return  eList.size();
   }
   
/** 
* Returns the total volume for all Ellipsoid objects.
* @return - used for aforementioned.    
**/

   public double totalVolume() {
      double totalVolume = 0;
      int index = 0;
      while (index < eList.size()) {
         totalVolume += eList.get(index).volume();
         index++;
      }
      
      return totalVolume;
   }
   
/** 
* Returns the total surface area for all Ellipsoid objects.
* @return - used for aforementioned.   
**/

   public double totalSurfaceArea() {
      double totalSArea = 0;
      int index = 0;
      while (index < eList.size()) {
         totalSArea += eList.get(index).surfaceArea();
         index++;
      }
      
      return totalSArea;
   }
   
/**
* Returns average volume for Ellipsoid objects. 
* @return - used for aforementioned.
**/

   public double averageVolume() {
      double averageVol = 0;
      if (eList.size() > 0)
      {
         averageVol = totalVolume() / eList.size();
         return averageVol;
      }
      return averageVol;
   }
/**
* Returns average surface area for Ellipsoid objects.
* @return - used for aforementioned.
**/

   public double averageSurfaceArea() {
      double avgSArea = 0;
      if (eList.size() > 0)
      {
         avgSArea = totalSurfaceArea() / eList.size();
         return avgSArea;
      }
      return avgSArea;
   }

/** 
* Returns String containing the name of
* the list followed by each ellipsoid in 
* the ArrayList, which includes name of 
* ellipsoid & the ellipsoid objs.
* @return - used for aforementioned.
**/

   public String toString() {
      String result = ellipsoidName + "\n";
      int index = 0;
      while (index < eList.size()) {
         result += "\n" + eList.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   
/** 
* Return String containing the name of
* the list followed by summary items:
* Ellipsoid objects, total volume,
* total surface area, average volume, & average
* surface area, which includes name of ellipsoids 
* & results for various method calls.
* @return - used for aforementioned
**/

   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      result += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"; 
      result += "\nTotal Surface Area: "  
         + df.format(totalSurfaceArea()) + " square units";
      result += "\nAverage Volume: "  
         + df.format(averageVolume()) + " cubic units";
      result += "\nAverage Surface Area: " 
         + df.format(averageSurfaceArea()) + " square units";
    
      return result;
   }
    
/**
* Returns ArrayList of Ellipsoid objects.
* @return - used for aforementioned.
*   
**/
   public ArrayList<Ellipsoid> getList() {
      return eList;
   }
    
/**
* Takes a String parameter representing the file name 
* reads in the file, storing the list name & creating 
* an ArrayList of Ellipsoid objects, uses the list name 
* & the ArrayList to create an EllipsoidList object.
* @return the EllipsoidList object.
* @param fileName - used.
* @throws FileNotFoundException - used.
**/

   public EllipsoidList readFile(String fileName) throws FileNotFoundException {
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
   
   //Scanner scan = new Scanner(System.in);
   //System.out.print("Enter file name: ");
   //String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      String ellipsoidListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double a = Double.parseDouble(scanFile.nextLine());
         double b = Double.parseDouble(scanFile.nextLine());
         double c = Double.parseDouble(scanFile.nextLine());
         
         Ellipsoid e = new Ellipsoid(label, a, b, c);
         myList.add(e);           
      }
      scanFile.close();
      
      EllipsoidList myEllipsoidList 
         = new EllipsoidList(ellipsoidListName, myList);
   
      return myEllipsoidList;                    
   }
   
/**
* Takes four parameters (label, a, b, and c), 
* creates a new Ellipsoid object, & adds it
* to the EllipsoidList object (adds it
* to the ArrayList of Ellipsoid objects in the
* EllipsoidList object).
* @param label - used for aforementioned.
* @param a - used for aforementioned.
* @param b - used for aforementioned.
* @param c - used for aforementioned.
**/
   public void addEllipsoid(String label, double a, 
      double b, double c) {
      Ellipsoid elNew = new Ellipsoid(label, a, b, c);
      eList.add(elNew);
    
   }
    
/**
* Return corresponding Ellipsoid object if
* found in the EllipsoidList object; otherwise
* returns null. Takes a label of an Ellipsoid 
* as the String parameter.
* @return - used for aforementioned. 
* @param label - used.
**/

   public Ellipsoid findEllipsoid(String label) {
      for (Ellipsoid listItem: eList)
      {
         if (listItem.getLabel().equalsIgnoreCase(label))
         {
            return listItem;
         }
      }
      return null;
   }
       
/**
* EllipsoidList object and deleted; otherwise
* returns null. Takes a String as a parameter 
* which represents the label of the Ellipsoid.
* @return - used for aforementioned
* @param label - used for aforementioned.
**/

   public Ellipsoid deleteEllipsoid(String label) {
      Ellipsoid varE1 = null;
      varE1 = findEllipsoid(label);
      if (findEllipsoid(label) != null)
      {
         
         eList.remove(varE1);
         return varE1;
      }
      return varE1;
   }
    
/**
*
* If not found, returns null.
* Takes four parameters (label a, b, & c), 
* uses the label to find the corresponding 
* Ellipsoid object.
* @param label - for label.
* @param a - for label a.
* @param b - for label b.
* @param c - for label c.
* @return Ellipsoid object if found.
**/

   public Ellipsoid editEllipsoid(String label, double a, 
      double b, double c) {
      Ellipsoid varE1 = null;
      varE1 = findEllipsoid(label);
      if (varE1 != null)
      {
         varE1.setA(a);
         varE1.setB(b);
         varE1.setC(c);
         return varE1;
      }
      return varE1;
   }
    
}