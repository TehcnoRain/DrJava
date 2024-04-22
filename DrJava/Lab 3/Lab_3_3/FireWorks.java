package Lab_3_3;

import static Media.Turtle.*;
import Media.*;                  // for Turtle and TurtleDisplayer
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants

  

/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */


public class FireWorks {
    private TurtleDisplayer display;
    private Turtle yertle;
    
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public FireWorks ( ) {
      
      display = new TurtleDisplayer();
      yertle = new Turtle(FAST);
      display.placeTurtle(yertle);      
      drawFireWorks();      
      display.close();
              
        
        // statements including call to method
        
    }; // constructor
    
    
    /** This method ...                                                          */
    
    private void drawFireWorks ( ) {     
      int x;
      int y;
      
      for (int i = 1; i<=20; i++)
      {        
        x =(int)(301*random())-150;
        y =(int)(301*random())-150; 
        yertle.moveTo(x,y);
        drawStarBurst();
      }
        };
    
    private void drawStarBurst ( ) {  
      int c;
      c =(int)(16777215*random());
      
       yertle.setPenColor(new Color(c));
        for ( int i=1 ; i<=10 ; i++ ) {          
            yertle.forward(20);
            yertle.penDown();
            yertle.forward(10);
            yertle.penUp();
            yertle.backward(30);      // back to center
            yertle.right(PI/5);
            yertle.penUp();
        };
    
        // local variables
    
        // statements
    
    }; // drawdrawFireWorks
    
    
    public static void main ( String[] args ) { FireWorks s = new FireWorks(); };
    
    
} // drawFireWorks
