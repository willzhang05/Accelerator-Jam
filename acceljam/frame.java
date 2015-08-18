//Name: William Zhang
//Date: 5/5/15
//Base Frame
package acceljam;
import javax.swing.*;

public class frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8392426097919792968L;
	public Roboto font, largeFont;
    public frame() throws Exception {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e){
		   e.printStackTrace();
		}
		catch (ClassNotFoundException e){
		   e.printStackTrace();
		}
		catch (InstantiationException e){
		   e.printStackTrace();
		}
		catch (IllegalAccessException e){
		   e.printStackTrace();
		}
		setTitle("Accelerator Jam");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		ImageIcon img = new ImageIcon("../icon.ico"); //Custom icon
		setIconImage(img.getImage());
    }
}