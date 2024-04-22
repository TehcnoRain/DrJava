package Assignment_5;

import Media.*;
/*

*/
 
public class CleanUp {
 
  private SoundPlayer  player;  // a player for the sound
  
  public CleanUp() {
    Sound original; // original sound
    Sound newSound; // clean sound
    
    player = new SoundPlayer();
    original = new Sound();
    player.placeSound(original);
    player.waitForUser();
    newSound = clean(original,2);
    player.placeSound(newSound);
    player.close();
    newSound.save();
  
  };
  
  private Sound clean (Sound original, int factor) {
Sound result;
Sample nSamp;
Sample oSamp;
int amp1,amp2,amp3,amp4,amp5, avgamp;
result = new Sound(original.getNumSamples(),original);
for (int i=2; i<result.getNumSamples()-2;i++) {
nSamp = result.getSample(i);
oSamp = original.getSample(i-2);
amp1 = oSamp.getAmp();
oSamp = original.getSample(i-1);
amp2 = oSamp.getAmp();
oSamp = original.getSample(i);
amp3 = oSamp.getAmp();
oSamp = original.getSample(i+1);
amp4 = oSamp.getAmp();
oSamp = original.getSample(i+2);
amp5 = oSamp.getAmp();
avgamp = (amp1+amp2+amp3+amp4+amp5)/2;
nSamp.setAmp(avgamp);
}
return result;

  }
  
  public static void main ( String[] args ) { CleanUp c = new CleanUp(); };
}