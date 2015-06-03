package acceljam;

import javax.swing.JFrame;

public class CarSelectorDriver{

   public static void main(String[] args){
      JFrame frame = new JFrame("Accelerator Jam");
      frame.setSize(800, 600);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new CarSelectorPanel());
      frame.setVisible(true);
   }
}