import java.util.Date;
public interface Item {
   public static final String MANUFACTURER = "OracleProduction";
   public void setProductionNumber(int prodNumber);
   public void setName(String name);
   public String getName();
   public Date getManufactureDate();
   public int getSerialNumber();
}
