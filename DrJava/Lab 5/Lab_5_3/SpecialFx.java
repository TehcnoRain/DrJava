package Lab_5_3;


import Media.*;                  // for picture and pictureDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

   

public class SpecialFx 
    {    
      private PictureDisplayer display;

      private static final double TOLERANCE = 190;
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public SpecialFx ( ) 
    {
      Picture  foreground;
      Picture  background;
      
      display = new PictureDisplayer();
      background = new Picture();
      display.placePicture(background);
      display.close();
      
      display = new PictureDisplayer();
      foreground = new Picture();
      display.placePicture(foreground);
      
      display.waitForUser();

      fillin(foreground,background);
      display.close();
      foreground.save();

        // local variables
        
        // statements including call to method
        
    }; // constructor
    
    private void fillin(Picture fore, Picture back)
    {
      Pixel pFore;
      Pixel pBack;
      Color pColor;
            
      while(fore.hasNext())
      {
         pFore = fore.next();
         pBack = back.next();
         if(pFore.getDistance(GREEN) < TOLERANCE)
         {
         pColor = pBack.getColor();
         pFore.setColor(pColor);
         }         
      }
    }
    

    
    // methods

    
    
    public static void main ( String[] args ) { SpecialFx s = new SpecialFx(); };
    
    
} // SpecialFx
