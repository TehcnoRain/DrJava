package Lab_6_3;


import Media.*;                  // for Media classes
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)     
  
  */

  
public class Repeat 
{
  private static final int TIMES = 3;
  private SoundPlayer player;
  
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Repeat ( ) 
    {
      Sound original;
    Sound repeated;
    
    player = new SoundPlayer();
    original = new Sound();
    player.playSound(original);
    player.waitfForUser();
    repeated = repeat(original,TIMES);
    player.placeSound(repeated);
    player.close();
    repeated.save();
    
        // local variables
        
        // statements
        
    }; // constructor
    
    private Sound repeat(Sound aSound, int nTimes)
    {
      Sound result;
      int numsamp;
      int pos;
      int amp;
      
      numSamp = aSound.getNumSamples();
      result = new Sound(num*nTimes,aSound);
      
      for(int j =1; j<=nTimes; j++)
      {
        for(int i = 0 ; i<numSamp; i++)
        {
          amp = aSound.getSample(i).getAmp();
          result.getSample(pos).setAmp(amp);
          pos = pos + 1;
        }
      }
      return result;
    }
    // methods

    
    
    public static void main ( String[] args ) { Repeat s = new Repeat(); };
    
    
} // Repeat
