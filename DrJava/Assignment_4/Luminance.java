package Assignment_4; 
 
 
import Media.*;                  // for picture and pictureDisplayer 
import java.awt.*;               // for Color objects and methods 
import static java.lang.Math.*;  // for math constants and functions 
import static java.awt.Color.*;  // for Color constants 
 
 
/** This class ... 
  * 
  * @author <your name> 
  * @version 1.0 (<date>)                                                        */ 
 
    
 
public class Luminance  
    {     
      private PictureDisplayer display; 
      private Picture backG; 
      private Picture foreG; 
    // instance variables 
     
     
    /** This constructor ...                                                     */ 
     
    public Luminance ( )  
    { 
      display = new PictureDisplayer(); 
      backG = new Picture(); 
      display.placePicture(backG); 
      display.waitForUser(); 
      foreG = new Picture();
      display.placePicture(foreG);
      display.waitForUser();
      blend(backG,foreG); 
      display.close(); 
      foreG.save(); 
        // local variables 
         
        // statements including call to method 
         
    }; // constructor 
     
    private void blend(Picture pic1, Picture pic2) 
    { 
      Pixel backP, foreP; 
      double bg , fg; 
      double bb , fb; 
      double br , fr;
      double factor;
      double bAvg , fAvg;
             
      while(pic1.hasNext()&&pic2.hasNext()) 
      { 
         backP = pic1.next(); 
        
         bg = backP.getGreen();  
         bb = backP.getBlue();  
         br = backP.getRed(); 
         
         bAvg = (br+bg+bb)/3;
         bAvg = clip(bAvg);
         
         foreP = pic2.next(); 
        
         fg = foreP.getGreen();  
         fb = foreP.getBlue();  
         fr = foreP.getRed(); 
         
         fAvg = (fr+fg+fb)/3;
         fAvg = clip(fAvg);
         factor = (bAvg/fAvg);
           
         foreP.setGreen((int)(fg*factor)); 
         foreP.setBlue((int)(fb*factor)); 
         foreP.setRed((int)(fr*factor)); 
      } 
    } 
     
    private int clip(double val) 
    { 
      if(val>=127.5) val = 127.5;
      return (int)val;
      
    } 
     
    // methods 
 
     
     
    public static void main ( String[] args ) { Luminance s = new Luminance(); }; 
     
     
} // Luminance 
