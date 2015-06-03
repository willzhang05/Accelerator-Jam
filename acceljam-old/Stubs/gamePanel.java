import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class gamePanel extends JPanel{
/**
@author William Zhang and Antioch Sanders
@version 0.0.1
**/    
	 private BufferedImage myImage;
    private Timer updateTimer;
    private int frameRate = 20;
    private final int N = 600;
    private int position = 0;
    
    public gamePanel(){
		

    }
    public void paintComponent(Graphics pen){

		/**
		* Method 
		@see main
		* Shows after startButton is pressed on the mainMenu.
		@see mainMenu
		**/
      
        pen.drawImage(myImage, 0, 0, N, N, null);
        drawBackGround(pen);

    }
    public void drawBackGround(Graphics pen){        
    }
    private class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
       /**
       * Get movements
       **/        
        }
    }

    private class pauseListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
       /**
       * Check for pause
       **/        
        }
    }


    public void update(){
    /**
    *Update game positions/graphics
    **/
    }
}
