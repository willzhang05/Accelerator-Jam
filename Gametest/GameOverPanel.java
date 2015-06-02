import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GameOverPanel extends JPanel{
    public final int N = 600;
    private String[] backgroundOptions = {"crash1.png", "crash2.png", "crash3.png",
                                          "crash4.png", "crash5.png", "crash6.png",
                                          "crash7.png", "crash8.png"};
    private String backgroundPath = "Resources\\Crashes\\";
//    private String text = "GG Well Played";
    
    public GameOverPanel(){
        chooseBackground();
        setFocusable(true);
        //USE GEOMETRY MANAGER, NOT SET LOCATION

//      JButton b = new JButton("Try Again");
//      b.setLocation(100, 100);
//      add(b);
    }
    
    public void paintComponent(Graphics pen){
        ImageIcon crash = new ImageIcon(backgroundPath);
        pen.drawImage(crash.getImage(), 0, 0, getWidth(), getHeight(), null);
        pen.setColor(new Color(0,0,0,200));
        pen.fillRect(0, 0, getWidth(), getHeight());
        Font boldFont = new Font("Calibri", Font.BOLD, 10);
        pen.setFont(boldFont);
        pen.setColor(Color.RED);
//        pen.drawString(text, 0, 500);
    }

    public void chooseBackground(){
        Random random = new Random();
        String choice = backgroundOptions[random.nextInt(backgroundOptions.length)];
        backgroundPath += choice;
    }


    public static void main(String[] args){
        JFrame frame = new JFrame("Lab00");
        frame.setSize(800, 600);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GameOverPanel());
        frame.setVisible(true);
    }
}