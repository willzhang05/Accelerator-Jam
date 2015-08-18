//Name: William Zhang and Antioch Sanders
//Date: 6/3/15
//Main Class
package acceljam;


public class main {
    public static void main(String[] args) throws Exception {
        frame game = new frame();
        game.setContentPane(new mainMenu(game));
        game.setVisible(true);
	}
}