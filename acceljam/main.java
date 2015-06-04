//Name: William Zhang
//Date: 6/3/15
//Main Class
package acceljam;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) throws Exception {
		frame game = new frame();
		game.setContentPane(new MainMenu(game));
		game.setVisible(true);
	}
}