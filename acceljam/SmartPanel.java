package acceljam;
import javax.swing.*;
import java.awt.*;

public class SmartPanel extends JPanel {
   private JFrame frame;

   public Roboto font = new Roboto(0, 16); //0 == PLAIN
	public Roboto largeFont = new Roboto(1, 72); //1 == BOLD
 
   public SmartPanel(JFrame startFrame){
      super();
      frame = startFrame;
   }
   public void changePanel(JPanel newPanel){
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