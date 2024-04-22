package Assignment_3; 
// 
import static Media.Turtle.*;    // makes turtle go really fast
import static java.lang.Math.*;  // for computing complex math problems (sqrt)
import Media.*;                  // for Turtle and TurtleDisplayer 
import java.awt.*;               // for Color objects and methods 
import static java.lang.Math.*;  // for math constants and functions 
import static java.awt.Color.*;  // for Color constants 
import java.util.Random;

 
 
/** This class ... 
  * 
  * @author Shane Thomas 
  * @version 1.0 (Oct 26.2015)                                                        */ 
 
public class Forest 
{ 
     
     
    // instance variables 
     private TurtleDisplayer display;
     private Turtle yertle;
     
    /** This constructor ...                                                     */ 
     
    public Forest ( ) 
    { 
      display = new TurtleDisplayer();
      yertle = new Turtle(FAST/3);
      display.placeTurtle(yertle);
      yertle.moveTo(-110,20);
      drawForest();
      display.close();
        // local variables 
         
        // statements including call to method 
         
    }; // constructor 
    
    private void drawSpokes (double side)
    {       
       for(int i=0; i<6; i++)
       {
        yertle.penDown();
        chooseColor();
        yertle.backward(side);
        yertle.penUp();
        yertle.forward(side);
        yertle.right(PI/3);       
       
       }

    }
     
    private void drawTree(int height ,int radius)
    {        
      yertle.penDown();
      yertle.left(PI/2);
      yertle.setPenWidth(10);
      yertle.setPenColor(LIGHT_GRAY);
      yertle.forward(height);
      yertle.right(PI/2);
      yertle.setPenWidth(radius);      
      drawSpokes(radius);
      yertle.right(PI/6);
      yertle.setPenWidth(radius*2);
      drawSpokes(radius);
      yertle.left(PI/6);
      yertle.penUp();
      
    }
       
    private void drawForest()
    {          
      Random random3 = new Random();
      int  rndTree = random3.nextInt(10 - 5) + 5;
           
      for(int i=1; i<rndTree; i++)
      {
      Random random1 = new Random();
      int rndsize = random1.nextInt(100 - 40) + 40;
      
      Random random2 = new Random();
      int  rndcanopy = random2.nextInt(20 - 10) + 10;
              
      drawTree(rndsize,rndcanopy);
      yertle.moveTo(-110,20);
      yertle.forward(50*i);
            
      if(i>=5)
      {
        yertle.moveTo(-110,-100);
        yertle.forward(50*(i-5));
      }
    
      }
               
    }
    
     private void chooseColor()
     {
       double min = 0;
       double max = 1.0;
       Random randomval = new Random();
       double  value = min + (max - min) * randomval.nextDouble();
       
      if(value<=0.75)
      {
        yertle.setPenColor(GREEN);
      }
      
      else 
      {
        yertle.setPenColor(RED);
      }     
      
     }
    
 
    public static void main ( String[] args ) { Forest s = new Forest(); }; 
     
     
} // Forest 
; 
