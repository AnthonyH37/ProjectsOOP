/**
 * Author: Anthony Horvath
 * Date: 12/11/2018
 * Description: Class for multiple aspects and atributes of the product
 */

import java.util.Date;

// Abstract class that implements the Item interface

public class Product implements Item, Comparable<Item> {
   protected int serialNumber;
   protected String manufacturer;
   protected Date manufacturedOn;
   protected String name;
  
   //class variable
   private static int currentProductionNumber = 1;
   
   /**
   * Constructor that takes in the name of the product and sets it to the variable name,
   * assigns the variable serialNumber to another variable. 
   * It increments currentProductionNumber and sets the current date and time to
   * a variable.
   */
  
  
   public Product(String name)
   {
       setName(name);
       setProductionNumber(currentProductionNumber);
       
       //Increment current production number in loop
       currentProductionNumber++;
       manufacturer = MANUFACTURER;
       manufacturedOn = new Date();
   }
   
   // Sets the production number of an item
   @Override
   public void setProductionNumber(int currentProductionNumber) {
       serialNumber = currentProductionNumber;
   }
   // Sets the name of an item
   @Override
   public void setName(String name) {
       this.name = name;
      
   }
   // Gets the name of the item
   @Override
   public String getName() {
       return name;
   }
   
   // Gets the manufacture date of the item
   @Override
   public Date getManufactureDate() {
       return manufacturedOn;
   }
   @Override
   
   // Gets the serial number of the item
   public int getSerialNumber() {
       return serialNumber;
   }
  
  /**
   * Provides a list of all information about the item.
   *
   * Returns a print of the manufacturer, serial number, date, and name of the item.
   */
   public String toString()
   {
       String str = "Manufacturer: " + manufacturer + "\n";
       str += "Serial Number: " + serialNumber + "\n";
       str += "Date: " + manufacturedOn + "\n";
       str += "Name: " + name ;
       return str;
      
   }
   //for comparing based on names ..step 14
       @Override
       public int compareTo(Item o) {
           return name.compareTo(o.getName());
       }
}