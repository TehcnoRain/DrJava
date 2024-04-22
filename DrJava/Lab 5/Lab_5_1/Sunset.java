package Lab_5_1;


import Media.*;                  // for picture and pictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

   

public class Sunset 
    {    
      private PictureDisplayer display;
      private Picture pic;
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Sunset ( ) 
    {
      display = new PictureDisplayer();
      pic = new Picture();
      display.placePicture(pic);
      display.waitForUser();
      makeSunset(pic);
      display.close();
      pic.save();
        // local variables
        
        // statements including call to method
        
    }; // constructor
    
    private void makeSunset(Picture pic)
    {
      Pixel p;
      int g;
      int b;
      int r;
            
      while(pic.hasNext())
      {
         p = pic.next((Pixel)*4);
       
         g = p.getGreen(); 
         b = p.getBlue(); 
         r = p.getRed();
         
         p.setGreen((int)(0.7*g));
         p.setBlue((int)(0.7*b));
         p.setRed((int)(0.7*r));
      }
    }
    
    // methods

    
    
    public static void main ( String[] args ) { Sunset s = new Sunset(); };
    
    
} // Sunset
