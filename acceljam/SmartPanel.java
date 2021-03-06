package acceljam;
import javax.swing.*;

public class SmartPanel extends JPanel {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1582013506267681338L;

private JFrame frame;

   public Roboto font = new Roboto(0, 18); //0 == PLAIN
	public Roboto largeFont = new Roboto(1, 80); //1 == BOLD
 
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