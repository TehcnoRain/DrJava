package Lab_4_2;

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
      yertle.moveTo(150,-150);
      yertle.setPenColor(GREEN);
      drawHouse(1.0);  
      yertle.moveTo(50,-100);
      yertle.setPenColor(RED);
      drawHouse(0.2);
      drawStarburst ();
      
      
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
    
    private void drawHouse (double scale) 
    {
      drawTriangle(120*scale);     
      yertle.left(PI);
      yertle.backward(110*scale);     
      drawRectangle(100*scale,80*scale);
      yertle.left(PI);         
    }
    
    private void drawStarburst ( ) 
    {
        
        int  c;  // the color for the starburst
        
        c = (int)(16777216*random());
        yertle.setPenColor(new Color(c));
        for ( int i=1 ; i<=10 ; i++ )
        {
            yertle.forward(20);
            yertle.penDown();
            yertle.forward(10);
            yertle.penUp();
            yertle.backward(30);
            yertle.right(PI/5);
        }
    }
    // methods

    
    
    public static void main ( String[] args ) { Scene s = new Scene(); };
    
    
} // Scene
