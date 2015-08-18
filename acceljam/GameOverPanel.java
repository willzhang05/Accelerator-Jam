package acceljam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class GameOverPanel extends SmartPanel{
    public final int N = 600;
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
            changePanel(new GamePanel(getFrame(), 30));
        }
    }
    private class Listener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            changePanel(new mainMenu(getFrame()));
        }
    }
	private class Listener3 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    public GameOverPanel(JFrame frame, int score){
      super(frame);
      setFocusable(true);
	  	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	   setBackground(Color.decode("#1E88E5"));
		
		label1 = new JLabel("Game Over");
		label1.setFont(largeFont);
		label1.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label1);
		
		label2 = new JLabel("Your Score: " + score);
		label2.setFont(font);
		label2.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label2);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setFont(font);
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.setBackground(Color.decode("#1E88E5"));
		add(panel);
		
		menuButton button1 = new menuButton("Restart", font, new Listener1());
		panel.add(button1);
		menuButton button2 = new menuButton("Back", font, new Listener2());
		panel.add(button2);
		menuButton button3 = new menuButton("Quit", font, new Listener3());
		panel.add(button3);
      
      Sound crash = new Sound("crash.wav");
      crash.play();
    }
    public void paintComponent(Graphics pen){
		pen.clearRect(0, 0, getWidth(), getHeight());
    }
 }