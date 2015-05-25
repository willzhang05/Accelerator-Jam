//import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel{
    public BufferedImage myImage;
    public Graphics myBuffer;
    private Timer updateTimer;
    private int frameRate = 60;
    public final int N = 600;
    private int position = 0;
    private RelativeObject background;
    private RelativeObject player;

    public GamePanel(){                                 //Instantiator
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        updateTimer = new Timer(1000 / frameRate, new Listener());
        updateTimer.start();
        addKeyListener(new MovementKeyListener);

        background = new RelativeObject(0, 0, N, 2*N, "Autoban.png");

        player = new RelativeObject(70,70,30,30,"basicCar.png");
        player.setSpeed(10);

    }
    public void paintComponent(Graphics pen){           //Repaint the screen
        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    private class Listener implements ActionListener{   //Timer
        public void actionPerformed(ActionEvent e){
           update();
           repaint();
           
        }
    }

    public void update(){                               //Update game
        myBuffer.clearRect(0,0, N, N);
        background.drawObj(myBuffer);
        background.moveRelativeTo(player);
        player.drawObj(myBuffer);
    }
    
    
    
    
    class MovementKeyListener extends KeyAdapter{
    
        public void keyPressed(KeyEvent event){
            if (event.getKeyCode == VK_LEFT){
               set player direction left
            }
            else if (){
               set player direction right 
            }
        }
    }
}
