package Lab_5_3;


import Media.*;                  // for picture and pictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

   

public class Brightness 
    {    
      private PictureDisplayer display;
      private Picture pic;
      private static final int FACTOR = 2;
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Brightness ( ) 
    {
      display = new PictureDisplayer();
      pic = new Picture();
      display.placePicture(pic);
      display.waitForUser();
      makeBrightness(pic, FACTOR);
      display.close();
      pic.save();
        // local variables
        
        // statements including call to method
        
    }; // constructor
    
    private void aveColor(Picture pic, int c, int r. int blockSize)
    {
      Pixel p;
      int g;
      int b;
      int r;
            
      while(pic.hasNext())
      {
         p = pic.next();
       
         g = p.getGreen(); 
         b = p.getBlue(); 
         r= p.getRed();
         
         p.setGreen(clip(g * br));
         p.setBlue(clip(b * br));
         p.setRed(clip(r * br));
      }
    }
    
    private int clip(int val)
    {
      if(val<=255 )
      {
        return val;
      }
      else
      {
        return 255;
      }
    }
    
    // methods

    
    
    public static void main ( String[] args ) { Brightness s = new Brightness(); };
    
    
} // Brightness
