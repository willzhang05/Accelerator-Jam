package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class gamePanel extends main{
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
		/**
		* Class gamePanel extends main.
		@see main
		* Shows after startButton is pressed on the mainMenu.
		@see mainMenu
		**/

    }
    public void paintComponent(Graphics pen){
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

    private class Listener implements ActionListener{
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
