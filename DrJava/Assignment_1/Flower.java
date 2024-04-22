package Assignment_1;

import Media.*; // Import ASCIIDisplayer from the Media package
import BasicIO.*;

public class Flower {
  
    private ASCIIDisplayer display;
    
    public Flower() {
        display = new ASCIIDisplayer();
        pattern(6);
    }

    private void pattern(int n) {
        for (int i = 0; i < n; i++) {
            display.writeInt((i + 1) * 2); // Fix syntax error and use correct assignment operator
            display.newLine();
        }
    }
    
    public static void main(String[] args) {
        Flower s = new Flower();
    }

}