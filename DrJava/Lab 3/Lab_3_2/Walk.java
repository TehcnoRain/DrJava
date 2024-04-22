package Lab_3_2;


import Media.*;                  // for Turtle and TurtleDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants

  

/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */


public class Walk {
    private TurtleDisplayer display;
    private Turtle yertle;
    
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Walk ( ) {
      
      display = new TurtleDisplayer();
      yertle = new Turtle();
      display.placeTurtle(yertle);
      drawWalk();
      display.close();
              
        
        // statements including call to method
        
    }; // constructor
    
    
    /** This method ...                                                          */
    
    private void drawWalk ( ) {     
      int x;
      int y;
      
      for (int i = 1; i<=20; i++)
      {
        yertle.penDown();
        x =(int)(301*random())-150;
        y =(int)(301*random())-150; 
        yertle.moveTo(x,y);
        yertle.penUp();
      }
        // local variables
    
        // statements
    
    }; // drawdrawWalk
    
    
    public static void main ( String[] args ) { Walk s = new Walk(); };
    
    
} // drawWalk
