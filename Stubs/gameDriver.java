import javax.swing.JFrame;


public class gameDriver
/**
@author Antioch
@version 0.0.1
**/
{

   public static void main(String[] args)
   {
      /**
      * Creates frame for GamePanel
      **/
      JFrame frame = new JFrame("AcceleratorJam");

      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new GamePanel());
      frame.setVisible(true);
   }
}