import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel{
    public BufferedImage myImage;
    public Graphics myBuffer;
    private Timer updateTimer;
    private int frameRate = 60;
    public final int N = 600;
    public int frameNumber = 0;
    private int position = 0;
    public SmartVehicleGenerator generator;
    private MapObject background;
    private PlayerObject player;

    public GamePanel(int startFrameRate){               //Constructor
        frameRate = startFrameRate;
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        updateTimer = new Timer(1000 / frameRate, new Listener());
        addKeyListener(new MovementKeyListener());
        setFocusable(true);

        String roadType = JOptionPane.showInputDialog("Enter road name (Autoban)");        
        background = new MapObject(N, "Roads\\"+roadType+".png");


        String carType = JOptionPane.showInputDialog("Enter filename (van)");
        player = new PlayerObject(N/2 - 35, 485, new VehicleType("taxi"));
        generator = new SmartVehicleGenerator(player, myBuffer, -500);
        player.setSpeed(10);
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
        generator.update();
        player.moveDirection(frameNumber);
        player.draw(myBuffer);
    }

    private class MovementKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent event){
            int tempDir = 0;
            if (event.getKeyCode() == 37 || event.getKeyCode() == 39){
               if (event.getKeyCode() == 37){               //Left
                  tempDir = player.LEFT;
               }
               else if (event.getKeyCode() == 39){         //Right
                  tempDir = player.RIGHT;
               }
               if(tempDir != player.getDirection()){
                  player.setHandlingSpeed(player.getMinHandlingSpeed());
               }
               player.setDirection(tempDir);
           }
        }
        public void keyReleased(KeyEvent event){
            if (event.getKeyCode() == 37 || event.getKeyCode() == 39){
               int tempDir = 0;
               if (event.getKeyCode() == 37){
                  if(player.getDirection() == player.LEFT){
                     tempDir = player.NO_DIR;
                  }
               }
               else if (event.getKeyCode() == 39){
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
}