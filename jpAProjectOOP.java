/**
 * ------------------------------------------------------------------------------
 *         ; FILE:	jpAProjectOOP.java
 *         ; BY:	Horvath, Anthony
 *         ; ORG:	COP 3003, 201809, 80602
 *         ; DESC:	Demonstrate use of Java Programming concepts
 *         ; and create a flexible structure that could be used in
 *         ; any production line.  This structure would then allow easy
 *         ; modification to handle different products.
 * ------------------------------------------------------------------------------
 */

/** Import libraries this program needs to function,
 *  will be used by variables, methods, classes.
 */

import java.util.Date;
import javafx.application.Application;
import javafx.stage.Stage;

public class jpAProjectOOP extends Application {

    public static void main(String[] args) {
        launch(args);
    }

        public interface Item {

            /** Initialize a constant (manufacturer because this
             * doesn't need to change) and methods, some with specified
             * return types.
             */

            final String manufacturer = "OracleProduction";
            void setProductionNumber(int productionNumber);
            void setName(String name);
            String getName();
            Date getManufactureDate();
            int getSerialNumber();

        }
    public enum ItemType {
        AU, VI, AM, VM;
    }

    public abstract class Product implements Item{

        /** Here we are implementing and using the elements of
         * interface Item
         */

        int serialNumber;
        String manufacturer;
        Date manufacturedOn;
        String name;
        Integer currentProductionNumber = 1;

        /** Here we are adding a constructor that sets serialNumber
         * to the current production number and then adding one each
         * time the program goes through the loop so the serial number
         * changes
         */
        public Product(String name) {
            this.name = name;
            serialNumber = currentProductionNumber;
            currentProductionNumber++;
            manufacturedOn = new Date(System.currentTimeMillis());
        }

        @Override
        public String toString() {
            return "Manufacturer : " + manufacturer + "\n" +
                    "Serial Number : " + serialNumber + "\n" +
                    "Date : " + manufacturedOn + "\n" +
                    "Name : " + name + "\n";
        }

        /**
         * Here are the gets and sets for the fields above
         * this information will be seen and used by the user
         */
        @Override
        public void setProductionNumber(int productionNumber) {
            currentProductionNumber = productionNumber;
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
    }
    @Override
    public void start(Stage primaryStage) {
    }
}
