import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Canvas;

class FishSim extends GameCanvas implements Runnable {
    // Simulate a school of fish with 2D graphics
    
    // The dimensions of the screen
    int cols;
    int rows; 

    public void run() {
        
    }

    public FishSim() {
        // Not quite sure what I'm doing yet
        super(false);
        rows = getHeight()/240;
        cols = getWidth()/240;
        System.out.println("cols" + cols);
        System.out.println("rows" + rows);
    }
}