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

        boolean underConstruction = false;

        if(underConstruction)
            game.setContentPane(new hardHatPanel(game));
        else
            game.setContentPane(new mainMenu(game));

        game.setVisible(true);
	}
}