//Name: William Zhang
//Date: 6/3/15
//Main Class
package acceljam;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main throws Exception {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                MainMenu ex = new MainMenu();
                ex.setVisible(true);
			}
		});
	}
}