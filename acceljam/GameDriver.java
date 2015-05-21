import javax.swing.JFrame;

public class GameDriver
{

   public static void main(String[] args)
   {
      JFrame frame = new JFrame("AcceleratorJam");

      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new mainMenu());
      frame.setVisible(true);
   }
}