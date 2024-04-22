package Lab_2_1;

import Media.*;
import static java.lang.Math.*;
import static java.awt.Color.*;

public class Staircase {
  
  private TurtleDisplayer display;
  private Turtle yertle;
  
  public Staircase () {
    
    display = new TurtleDisplayer();
    yertle = new Turtle();
    display.placeTurtle(yertle);
    yertle.left(PI/2);   
    yertle.forward(10);  
    yertle.right(PI/2);
    
 //stair case     
    
    for(int i = 0; i < 5; i++)
      {
       
       yertle.penDown();
       yertle.forward(10);
       yertle.right(PI/2);
       yertle.forward(10);  
       yertle.left(PI/2);      
       yertle.penUp();
    }
    
    yertle.forward(10);  
    yertle.left(PI/2);
    
     for(int i = 5; i < 9; i++)
      {
       
       yertle.penDown();
       yertle.backward(10);
       yertle.left(PI/2);
       yertle.backward(10);  
       yertle.right(PI/2);      
       yertle.penUp();
    }
     
     yertle.left(PI/2);   
    yertle.forward(10);  
    yertle.right(PI/2);
     
//     for(int i = 9; i < 14; i++)
//      {
//       
//       yertle.penDown();
//       yertle.backward(10);
//       yertle.right(PI/2);
//       yertle.backward(10);  
//       yertle.left(PI/2);      
//       yertle.penUp();
//    }
//     
//     for(int i = 14; i < 19; i++)
//      {
//       yertle.penDown();
//       yertle.forward(10);
//       yertle.left(PI/2);
//       yertle.forward(10);  
//       yertle.right(PI/2);      
//       yertle.penUp();
//    }
//    
//    yertle.left(PI/2);   
//    yertle.forward(10);  
//    yertle.right(PI/2);
            
//    for( int i = 0; i < 5 ; i ++)
//    {
//       
//       yertle.penDown();
//       yertle.left(PI/2);
//       yertle.forward(10);
//       yertle.right(PI/2);
//       yertle.forward(10);  
//       yertle.penUp();
//       i++;
//    }
    
//    yertle.penDown();
//    yertle.left(PI/2);
//    yertle.forward(10);
//    yertle.left(PI/2);
//    yertle.forward(10);
//    yertle.right(PI/2);
//    yertle.forward(10);
//    yertle.left(PI/2);
//    yertle.forward(10);
//    yertle.right(PI/2);
//    yertle.forward(10);
//    yertle.left(PI/2);
//    yertle.forward(10);
//    yertle.right(PI/2);
//    yertle.forward(10);
//    yertle.left(PI/2);
//    yertle.forward(10);
//    yertle.right(PI/2);
//    yertle.forward(10);   
//    yertle.left(PI/2);
//    yertle.forward(10);
   
//    yertle.forward(40);
//    yertle.right(PI/2);
//    yertle.forward(40);
//    yertle.right(PI/2);
//    yertle.forward(40);
//    yertle.right(PI/2);
//    yertle.penUp();
    
    display.close();
    
  };
  
  public static void main ( String[] args ){ Staircase s = new Staircase(); };
}
    
