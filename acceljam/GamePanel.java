import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class GamePanel extends JPanel
{
   private BufferedImage myImage;
   private Timer updateTimer;
   private int frameRate = 20;
   private final int N = 600;
   private int position = 0;

   public GamePanel()
   {
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      Graphics buffer = myImage.getGraphics();
      updateTimer = new Timer(1000/frameRate, new Listener());
      updateTimer.start();
   }


   public void paintComponent(Graphics pen)
   {
      pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      drawBackGround(pen);
   }


   public void drawBackGround(Graphics pen)
   {
      ImageIcon background = new ImageIcon("perfectRoad.png");
      pen.drawImage(background.getImage(), 0, 0 + position, 600, 1200 + position, null);

   }
   
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         update();
         repaint();
         System.out.println("Position at: " + position);         
      }
   }
   
   public void update()
   {
      position++;   
   }
}