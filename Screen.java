/**
 * Author: Anthony Horvath
 * Date: 12/11/2018
 * Description: Uses ScreenSpec interface to return screen atributes
 */

public class Screen implements ScreenSpec {
   protected String resolution;
   protected int refreshrate;
   protected int responsetime;
  
   public Screen(String resolution, int refreshrate, int responsetime)
   {
       this.resolution = resolution;
       this.refreshrate = refreshrate;
       this.responsetime = responsetime;
   }
   @Override
   public String getResolution() {
       return resolution;
   }
   @Override
   public int getRefreshRate() {
       return refreshrate;
   }
   @Override
   public int getResponseTime() {
       return responsetime;
   }
   public String toString()
   {
       return "Resolution: " + resolution + "\n" +
               "Refresh Rate: " + refreshrate + "\n" +
               "Response Time: " + responsetime ;
   }
}