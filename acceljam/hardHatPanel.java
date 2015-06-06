package acceljam;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class hardHatPanel extends SmartPanel{
    private String messageLineOne = "Accelerator-Jam is currently being revised."; 
    private String messageLineTwo = "Thank you for your patience.";
    public hardHatPanel(JFrame frame){
        super(frame);
        setFocusable(true);
        
        //JLabel notice = new JLabel(message);
        //notice.setFont(new Font("Calibri", Font.PLAIN, 26));
        //notice.setForeground(Color.yellow);
        //add(notice, BorderLayout.CENTER);
    }
    public void paintComponent(Graphics pen){
        ImageIcon backgroundImage = new ImageIcon("acceljam/Resources/backgrounds/construction.png");
        pen.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), null);
        pen.setColor(new Color(0,0,0,100));
        pen.fillRect(0, 0, getWidth(), getHeight());
        pen.setFont(new Font("Calibri", Font.PLAIN, 26));
        pen.setColor(Color.yellow);
        pen.drawString(messageLineOne, getWidth()/4, getHeight()/2);
        pen.drawString(messageLineTwo, getWidth()/4, getHeight()/2 + 25);
    }
}