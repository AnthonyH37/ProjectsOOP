/**
 * Author: Anthony Horvath
 * Date: 12/11/2018
 * Description: Audio player class that prints audio player controls and audio specifications. Implements product
 */

public class AudioPlayer extends Product implements MultimediaControl, Comparable<Item> {
   protected String audioSpecification;
   protected ItemType mediaType;
  
   public AudioPlayer(String name, String specification)
   {
       super(name);
       audioSpecification = specification;
       mediaType = ItemType.AU;
   }
   @Override
   public void play() {
       System.out.println("Playing");
   }
   @Override
   public void stop() {
       System.out.println("Stopped");
   }
   @Override
   public void previous() {
       System.out.println("Previous");
   }
   @Override
   public void next() {
       System.out.println("Next");
   }
  
   public String toString()
   {
       String str = super.toString() + "\n" ;
       str += "Audio Specification: " + audioSpecification + "\n" + "Type: " + mediaType ;
       return str;
   }
  
}