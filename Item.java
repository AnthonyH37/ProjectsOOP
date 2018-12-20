/**
 * Author: Anthony Horvath Date: 12/11/2018 Description: Item class that gets and sets info on the
 * items produced
 */
import java.util.Date;

// Interface that contains the functions all items must have.

public interface Item {
  public static final String MANUFACTURER = "OracleProduction";

  // Sets the production number of the item
  public void setProductionNumber(int currentProductionNumber);

  // Sets the name of the item
  public void setName(String name);

  // Gets the name of the item.
  public String getName();

  // Gets the manufacture date of the item
  public Date getManufactureDate();

  // Gets the serial number of the item
  public int getSerialNumber();
}
