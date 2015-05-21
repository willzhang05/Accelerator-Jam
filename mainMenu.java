import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JFrame {
    public mainMenu(){
        initUI();
	}
	private void initUI() {
        setTitle("Main Menu");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(quitButton("Quit"));
	}
	public JButton quitButton(String text){
		JButton qB = new JButton(text);	
		qB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		return qB;
	}
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                mainMenu ex = new mainMenu();
                ex.setVisible(true);
			}
		});
	}
}