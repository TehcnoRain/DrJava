package Lab_4_1;

import static Media.Turtle.*;
import Media.*;                  // for Turtle and TurtleDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Scene 
{
    
    private TurtleDisplayer display;
    private Turtle yertle;
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Scene ( ) 
    {
      display = new TurtleDisplayer();
      yertle = new Turtle(FAST);
      display.placeTurtle(yertle); 
      yertle.moveTo(-75,75);
      drawTriangle(50);
      yertle.moveTo(75,-75);
      drawRectangle(60,20);

        // local variables
        
        // statements including call to method
        
    }; // constructor
    
    private void drawTriangle (double side)
    {
      for (int i = 0; i<3; i++)
      {
        yertle.penDown();
        yertle.forward(side);
        yertle.left(2*PI/3);
        yertle.penUp();
      }
    }
    
    private void drawRectangle (double width, double height) 
    {
      for (int i = 0; i<2; i++)
      {
        yertle.penDown();
        yertle.forward(width);
        yertle.right(3*PI/2);
        yertle.forward(height);
        yertle.right(3*PI/2);
        yertle.penUp();
      }
    }
    // methods

    
    
    public static void main ( String[] args ) { Scene s = new Scene(); };
    
    
} // Scene
