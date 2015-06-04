//Name: William Zhang
//Date: 5/5/15
//Base Frame
package acceljam;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame {
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
      font = new Roboto(0, 16); //0 == PLAIN
      largeFont = new Roboto(1, 72); //1 == BOLD
    }
}