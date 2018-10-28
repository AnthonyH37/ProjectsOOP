import java.util.Date;
public class Product implements Item, Comparable<Item> {
   protected int serialNumber;
   protected String manufacturer;
   protected Date manufacturedOn;
   protected String name;
  

   private static int currentProductionNumber = 1;
  
  
   public Product(String name)
   {
       setName(name);
       setProductionNumber(currentProductionNumber);
       currentProductionNumber++;
       manufacturer = MANUFACTURER;
       manufacturedOn = new Date();
   }
   @Override
   public void setProductionNumber(int prodNumber) {
       serialNumber = prodNumber;
   }
   @Override
   public void setName(String name) {
       this.name = name;
      
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public Date getManufactureDate() {
       return manufacturedOn;
   }
   @Override
   public int getSerialNumber() {
       return serialNumber;
   }
  
   public String toString()
   {
       String str = "Manufacturer: " + manufacturer + "\n";
       str += "Serial Number: " + serialNumber + "\n";
       str += "Date: " + manufacturedOn + "\n";
       str += "Name: " + name ;
       return str;
      
   }

       @Override
       public int compareTo(Item o) {
           return name.compareTo(o.getName());
       }
}
