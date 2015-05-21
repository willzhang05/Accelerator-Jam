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
	/*private BufferedImage myImage;
    private Timer updateTimer;
    private int frameRate = 20;
    private final int N = 600;
    private int position = 0;*/
    
    public gamePanel(){
		/**
		* Class gamePanel extends main.
		@see main
		* Shows after startButton is pressed on the mainMenu.
		@see mainMenu
		**/
        setTitle("Accelerator Jam");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        Graphics buffer = myImage.getGraphics();
        updateTimer = new Timer(1000 / frameRate, new Listener());
        updateTimer.start();*/
    }
    public void paintComponent(Graphics pen){
		/**
		* Method 
		@see main
		* Shows after startButton is pressed on the mainMenu.
		@see mainMenu
		**/
        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
        drawBackGround(pen);
    }
    public void drawBackGround(Graphics pen){
        ImageIcon background = new ImageIcon("perfectRoad.png");
        pen.drawImage(background.getImage(), 0, 0 + position, 600, 1200 + position, null);
        
    }
    private class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            update();
            repaint();
            System.out.println("Position at: " + position);
        }
    }
    public void update(){
        position++;
    }*/
}
