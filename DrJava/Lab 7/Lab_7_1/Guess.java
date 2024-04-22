package Lab_7_1;


import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions
import java.util.Random;


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Guess
{
    
  private ASCIIDisplayer display;
  private ASCIIPrompter promt;
  
    
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Guess ( ) 
    {
      int guess;
      Random random = new Random();
      int x = random.nextInt(100-0) + 0;
      int number = x;
      int count = 0;
      

      display = new ASCIIDisplayer();
      promt = new ASCIIPrompter();
      display.setLabel("Guess Game");
      promt.setLabel("Guess");
      
      
         
      display.writeString("Guess a number between 0 and 100");
      display.newLine();
      display.newLine();
      
      for(;;)
      {
        guess = promt.readInt();
        display.newLine();
        display.writeInt(guess);
        count = count + 1;
        if(guess<number) display.writeString("Low");
        if(guess>number) display.writeString("High");
        if(guess==number) break;
      }
      
      display.newLine();
      display.writeString("Correct in");
      display.writeInt(count);
      display.writeString("Guesses");
    
      
      display.close();
      promt.close();
      
        // local variables
        
        // statements
        
    }; // constructor
    
    
    // methods

    
    
    public static void main ( String[] args ) { Guess o = new Guess(); };
    
    
} // Guess
