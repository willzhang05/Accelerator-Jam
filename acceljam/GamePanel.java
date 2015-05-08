import java.awt.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel
{
   private BufferedImage myImage;
   public Panel03()
   {
      final int N = 600;
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      Graphics buffer = myImage.getGraphics();
}