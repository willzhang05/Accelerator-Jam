import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;


public class CarSelectorPanel extends JPanel{
    public BufferedImage myImage;
    public Graphics myBuffer;
    public final int N = 600;
   
    public CarSelectorPanel(){
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        setFocusable(true);
    }

    public void paintComponent(Graphics pen){
        drawPanel();
        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    public void drawPanel(){
        
        int carSpeed = 1000;
        int carOverallHandling =  34;
        
        myBuffer.setColor(Color.decode("#EEEEEE"));
        myBuffer.fillRect(0, 0, N, N);
        myBuffer.setColor(Color.decode("#BBBBBB"));
        myBuffer.fillOval(100, 50, 400, 400);
        myBuffer.setColor(new Color(230, 230, 230));
        myBuffer.fillRect(5, 500, 530, 95);
        myBuffer.setColor(new Color(0, 230, 80));
        myBuffer.fillRect(540, 500, 55, 95);
        myBuffer.setColor(Color.BLACK);
        myBuffer.drawString("Top Speed: "+carSpeed+"\nHandling: "+carOverallHandling, 15, 515);
        myBuffer.drawString("Handling: ", 15, 535);        
    }



}