package Lab_6_1;


import Media.*;                  // for Media classes
import java.awt.*;               // for Color objects and methods
import static java.lang.Math.*;  // for math constants and functions
import static java.awt.Color.*;  // for Color constants


/** This class ...
  *
  * @author <your name>
  * @version 1.0 (<date>)                                                        */

public class Noisy {
    
    private SoundPlayer player;
    private static final int NOISE_LEVEL = 1000;
    // instance variables
    
    
    /** This constructor ...                                                     */
    
    public Noisy ( ) {

      Sound theSound;
        // local variables
        
      player = new SoundPlayer();
      theSound = new Sound();
      player.waitforUser();
      makeNoise(theSound , NOISE_LEVEL);
      player.close();
      theSound.save();
     
      
        // statements
        
    }; // constructor
    
    private void makeNoisy()
    {
      Sample s;
      int amp;
      int newAmp;
      
      while(aSound.hasNext())
      {
        s = aSound.next();
        amp = s.getAmp();
        s.setAmp(newAmp);
      }
    }
    
    // methods

    
    
    public static void main ( String[] args ) { Noisy s = new Noisy(); };
    
    
} // Noisy
