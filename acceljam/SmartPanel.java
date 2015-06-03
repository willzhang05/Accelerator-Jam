package acceljam;

import javax.swing.*;
import java.awt.*;

public class SmartPanel extends JPanel{

   private JFrame frame;

   public SmartPanel(JFrame startFrame){
      super();
      frame = startFrame;
   }

   public void changeFrame(JPanel newPanel){
      frame.setContentPane(newPanel);
      frame.revalidate();
   }

   public JFrame getFrame(){
      return frame;
   }

   public void setFrame(JFrame newFrame){
      frame = newFrame;
   }
}