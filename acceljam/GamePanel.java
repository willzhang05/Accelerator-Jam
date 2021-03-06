package acceljam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class GamePanel extends SmartPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -17312404049991312L;
	public BufferedImage myImage;
    public Graphics myBuffer;
    private Timer updateTimer;
    private int frameRate = 60;
    public final int N = 600;
    public int frameNumber = 0;
    public SmartVehicleHandler handler;
    private MapObject background;
    private Sound backgroundMusic;
    private int score = 0;
    private PlayerObject player;
    private String[] applicable = {"coupe", "hatch", "luxury", "taxi", "pickup1", 
                                   "pickup2", "van", "boxvan", "flatbed"};
    private String vehicleChoices = "coupe, hatch, luxury, taxi, pickup1, pickup2, "
                                   +"van, boxvan, flatbed";

    public GamePanel(JFrame frame, int startFrameRate){               //Constructor
        super(frame);
        frameRate = startFrameRate;
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        updateTimer = new Timer(1000 / frameRate, new Listener());
        addKeyListener(new MovementKeyListener());
        setFocusable(true);

        String roadType = "autobahn";
        background = new MapObject(N, roadType+".png");
        backgroundMusic = new Sound(roadType+".wav");

        String vehicleToUse = "ll";
	     boolean myBool = true;
        while(myBool){
    	      vehicleToUse = JOptionPane.showInputDialog("Choose from: " + vehicleChoices);
	         for(String i: applicable){
	             if(i.equals(vehicleToUse)){
                    myBool = false;
     		       }
	         }
	     }
        player = new PlayerObject(N/2 - 35, 485, new VehicleData(vehicleToUse));

        handler = new SmartVehicleHandler(player, myBuffer, -1000);
        player.setSpeed(player.getData().getMinSpeed());
        updateTimer.start();
        backgroundMusic.loop();
    }
    public void paintComponent(Graphics pen){           //Repaint the screen
        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
        frameNumber += 1;
    }
    private class Listener implements ActionListener {   //Timer
        public void actionPerformed(ActionEvent e){
           update();
           repaint();
        }
    }
    public void update(){                               //Update game
        checkGameOver();
        myBuffer.clearRect(0,0, N, N);
        background.draw(myBuffer);
        background.moveRelativeTo(player);
        handler.update();
        if(frameNumber % 100 == 0){
            if(player.getSpeed()<=player.getData().getTopSpeed()){
               player.setSpeed(player.getSpeed()+player.getData().getAcceleration());
            }
        }
        player.moveDirection(frameNumber);
        player.draw(myBuffer);
        myBuffer.setColor(Color.decode("#D81B60"));
		myBuffer.setFont(font);
        score += player.getSpeed()/10;
        myBuffer.setColor(new Color(100, 100, 100));
        myBuffer.fillRect(N / 2 - 60, 0, 120, 40);
        myBuffer.setColor(Color.red);
        myBuffer.drawString("Score: " + score, N / 2 - 55, 30);
    }
    public void checkGameOver(){
        if(player.checkDeath(handler)){
            updateTimer.stop();
            backgroundMusic.stop();
            changePanel(new GameOverPanel(getFrame(), score));
        }
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
