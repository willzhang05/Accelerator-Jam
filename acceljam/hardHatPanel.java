package acceljam;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class hardHatPanel extends SmartPanel{
    private String messageLineOne = "The core of Accelerator-Jam is being revised."; 
    private String messageLineTwo = "Thank you for your patience.";
    public hardHatPanel(JFrame frame){
        super(frame);
        setFocusable(true);
    }
    public void paintComponent(Graphics pen){
        ImageIcon backgroundImage = new ImageIcon("acceljam/Resources/backgrounds/construction.png");
        pen.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), null);
        pen.setColor(new Color(0,0,0,150));
        pen.fillRect(0, 0, getWidth(), getHeight());
        pen.setFont(new Font("Calibri", Font.PLAIN, 26));
        pen.setColor(Color.yellow);
        pen.drawString(messageLineOne, getWidth()/4, getHeight()/2);
        pen.drawString(messageLineTwo, getWidth()/4, getHeight()/2 + 25);
    }
}