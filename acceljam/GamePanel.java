package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class GamePanel extends SmartPanel{
    public BufferedImage myImage;
    public Graphics myBuffer;
    private Timer updateTimer;
    private int frameRate = 60;
    public final int N = 600;
    public int frameNumber = 0;
    private int position = 0;
    public SmartVehicleHandler handler;
    private MapObject background;
    private PlayerObject player;
    private String vehicleChoices = "AWDhatch, AWDluxury, AWDpickup,\nboxvan, "
                                   +"coupe, flatbed,\npickup, taxi, van";

    public GamePanel(JFrame frame, int startFrameRate){               //Constructor
        super(frame);
        frameRate = startFrameRate;
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        updateTimer = new Timer(1000 / frameRate, new Listener());
        addKeyListener(new MovementKeyListener());
        setFocusable(true);

        String roadType = JOptionPane.showInputDialog("Enter road name (Autobahn)");
        background = new MapObject(N, roadType+".png");

        String vehicleToUse = JOptionPane.showInputDialog("Choose from: " + vehicleChoices);
        player = new PlayerObject(N/2 - 35, 485, new VehicleType(vehicleToUse));

        handler = new SmartVehicleHandler(player, myBuffer, -200);
        player.setSpeed(20);
        updateTimer.start();
    }
    public void paintComponent(Graphics pen){           //Repaint the screen
        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
        frameNumber += 1;
    }

    private class Listener implements ActionListener{   //Timer
        public void actionPerformed(ActionEvent e){
           update();
           repaint();
        }
    }

    public void update(){                               //Update game
        myBuffer.clearRect(0,0, N, N);
        background.draw(myBuffer);
        background.moveRelativeTo(player);
//        handler.update();
        player.moveDirection(frameNumber);
        player.draw(myBuffer);
    }

    private class MovementKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent event){
            int tempDir = player.getDirection();
            if (event.getKeyCode() == 37){               //Left
               tempDir = player.LEFT;
            }
            if (event.getKeyCode() == 39){         //Right
               tempDir = player.RIGHT;
            }
            if(tempDir != player.getDirection()){
               player.setHandlingSpeed(player.getMinHandlingSpeed());
            }
            player.setDirection(tempDir);
        }
        public void keyReleased(KeyEvent event){
            int tempDir = player.getDirection();
            if (event.getKeyCode() == 37){
                if(player.getDirection() == player.LEFT){
                    tempDir = player.NO_DIR;
                }
            }
            if (event.getKeyCode() == 39){
                if(player.getDirection() == player.RIGHT){
                    tempDir = player.NO_DIR;
                }
            }
            if(tempDir != player.getDirection()){
                player.setHandlingSpeed(player.getMinHandlingSpeed());
            }
            player.setDirection(tempDir);
        }
    }
}
