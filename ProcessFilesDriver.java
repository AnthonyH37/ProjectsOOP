/** Author: Anthony Horvath Date: 12/11/2018 Description: FileReader and ProcessFiles Driver */
import java.io.FileReader;

public class ProcessFilesDriver {
  public static void main(String[] args) {

    try {
      FileReader fr = new FileReader("C:\\LineTests\\TestResults.txt");

      int i;
      while ((i = fr.read()) != -1) System.out.print((char) i);
    } catch (Exception ex) {
      System.out.println("File reader didn't work");
    }
  }
}
