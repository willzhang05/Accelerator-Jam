//Name: William Zhang
//Date: 5/5/15
//Main Menu
package acceljam;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JLabel label1;
    private JPanel panel;
	private class menuButton extends JButton {
		public menuButton(String text, Font font, ActionListener listener){
			setText(text);
			setFont(font);
			addActionListener(listener);
		}
	}
	private class Listener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            //Go to car selector
        }
    }
    private class Listener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public MainMenu() throws Exception {
		setTitle("Accelerator Jam");
		setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		ImageIcon img = new ImageIcon("../icon.ico");
		setIconImage(img.getImage());
        Roboto font = new Roboto(0, 16); //0 == PLAIN
        Roboto largeFont = new Roboto(1, 144); //1 == BOLD

        label1 = new JLabel("Accelerator Jam");
        label1.setFont(largeFont);
        label1.setForeground(Color.decode("#1E88E5"));
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label1);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setFont(font);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(panel);
        
        menuButton button1 = new menuButton("Start", font, new Listener1());
        panel.add(button1);
        menuButton button2 = new menuButton("Quit", font, new Listener2());
        panel.add(button2);
    }
}