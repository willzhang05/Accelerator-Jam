//Name: William Zhang
//Date: 5/5/15
//Main Menu
package acceljam;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends SmartPanel {
	private JPanel panel;
	private JLabel label1, label2;
	private class menuButton extends JButton {
		public menuButton(String text, Font font, ActionListener listener){
			setText(text);
			setFont(font);
			addActionListener(listener);
		}
	}
	private class Listener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
//            changePanel(new VehicleSelectorPanel(getFrame()));
            changePanel(new GamePanel(getFrame(), 30));
        }
    }
    private class Listener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public mainMenu(JFrame frame){
		super(frame);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode("#D81B60"));
		label1 = new JLabel("Accelerator Jam");
		label1.setFont(largeFont);
		label1.setForeground(Color.decode("#1E88E5"));
		label1.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label1);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setFont(font);
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.setBackground(Color.decode("#D81B60"));
		add(panel);
		
		menuButton button1 = new menuButton("Start", font, new Listener1());
		panel.add(button1);
		menuButton button2 = new menuButton("Quit", font, new Listener2());
		panel.add(button2);
		
		label2 = new JLabel("By Antioch Sanders and William Zhang           Partial sound credits to: http://www.freesfx.co.uk/");
		label2.setFont(font);
		label2.setForeground(Color.decode("#EEEEEE"));
		label2.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label2);
    }
}