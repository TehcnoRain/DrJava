package Assignment_2; 
// 
import static Media.Turtle.*;    // makes turtle go really fast
import static java.lang.Math.*;  // for computing complex math problems (sqrt)
import Media.*;                  // for Turtle and TurtleDisplayer 
import java.awt.*;               // for Color objects and methods 
import static java.lang.Math.*;  // for math constants and functions 
import static java.awt.Color.*;  // for Color constants 
 
 
/** This class ... 
  * 
  * @author Shane Thomas 
  * @version 1.0 (Oct 19.2015)                                                        */ 
 
public class Cover 
{ 
     
     
    // instance variables 
     private TurtleDisplayer display;
     private Turtle yertle;
     
    /** This constructor ...                                                     */ 
     
    public Cover ( ) 
    { 

      display = new TurtleDisplayer();
      yertle = new Turtle(FAST/3);
      display.placeTurtle(yertle);
      yertle.backward(90);
      yertle.right(PI/2);
      yertle.forward(120);
      yertle.left(PI/2);
      drawCover();
      display.close();
        // local variables 
         
        // statements including call to method 
         
    }; // constructor 
    
    private void drawTriangle (int side, double angle, double hyp )
    {
       yertle.penDown();
        yertle.backward(side);
        yertle.left(PI/2);
        yertle.forward(side);
        yertle.right(angle);
        yertle.forward(hyp); 
       yertle.right(PI/2-angle);
       yertle.penUp();

    }
     
    private void drawPatch()
    {
      for(int i=0; i<4; i++)
      {
         drawTriangle(30, 3*PI/4, sqrt(1800)); 
         yertle.backward(30);
         yertle.left(PI/2);
         yertle.forward(30);       
      }
    }
    
    private void drawRow()
    {
      for(int i=0; i<5; i++)
      {
      drawPatch();
      yertle.forward(60);      
      }
               
    }
    
     private void drawCover()
     {
      for(int i=0; i<5; i++)
      {
        drawRow();
        yertle.backward(300);     
        yertle.left(PI/2);
        yertle.forward(60);
        yertle.right(PI/2);
      }
     }
    
 
    public static void main ( String[] args ) { Cover s = new Cover(); }; 
     
     
} // Cover 
