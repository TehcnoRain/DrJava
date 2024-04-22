package Lab_6_2;


import Media.*;                  // for Media classes
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class DownSize 
{
    
    
    // instance variables
    private PictureDisplayer display;
    
    /** This constructor ...                                                     */
    
    public DownSize ( ) 
    {
      Picture  pic;
      
      pic = new Picture();
      display = new PictureDisplayer(pic);      
      display.close();
      color(pic , 400, 680,4);
      display = new PictureDisplayer(pic);   
      display.waitForUser();
      display.close();
                 
      pic.save();
    }; // constructor
    
    private Color color(Picture pic, int c, int r, int blockSize)
    {
     Color result;
     result = new Color(pic.getRGB());
     int red = result.getRed();
     int blue = result.getBlue();
     int green = result.getGreen();
     
     for(int i=0; i<c; i++)
     {
       for(int j = 0; j < r; j++)
       {
         result.getPixel(c,r).setColor(pic.getPixel(c+(blockSize-c),r+(blockSize-r)).getColor());
       }
       }
     return result;
     }
    
//    private void paint(Picture pic, int c, int r, int blockSize, Color color)
//    {
//      color(pic , 0, 0,4);
//    }
//    
//    private void pixelate(Picture pic, int blockSize)
//    {
//      paint(pic, 4, 4, 4, color);
//    }
    // methods
    

    
    public static void main ( String[] args ) { DownSize s = new DownSize(); };
    
    
} // DownSize
