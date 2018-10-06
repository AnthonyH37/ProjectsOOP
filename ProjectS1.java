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
