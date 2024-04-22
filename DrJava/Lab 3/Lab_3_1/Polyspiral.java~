package Lab_3_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants

  

/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */


public class Polyspiral {
    private TurtleDisplayer display;
    private Turtle yertle;
    
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Polyspiral ( ) {
      
      display = new TurtleDisplayer();
      yertle = new Turtle();
      display.placeTurtle(yertle);
      drawPolyspiral();
      display.close();
              
        
        // statements including call to method
        
    }; // constructor
    
    
    /** This method ...                                                          */
    
    private void drawPolyspiral ( ) {
    
      int side = 2;
      double angle = PI/6;
      
      for (int x = 1; x<=30; x++)
      {
        yertle.penDown();
        yertle.forward(side);
        yertle.right(angle);
        side = side + 2;
        yertle.penUp();
      }
        // local variables
    
        // statements
    
    }; // drawPolyspiral
    
    
    public static void main ( String[] args ) { Polyspiral s = new Polyspiral(); };
    
    
} // Polyspiral
