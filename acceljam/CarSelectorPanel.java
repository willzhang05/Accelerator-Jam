package acceljam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Scanner;
import java.io.*;

public class CarSelectorPanel extends SmartPanel {
    private BufferedImage myImage;
    private Graphics myBuffer;
    private final int N = 600;
    public String[] cars;
    public CarSelectorPanel(JFrame startFrame){
		super(startFrame);
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        setFocusable(true);
    }
    public void paintComponent(Graphics pen){
        drawPanel();
        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }
    public void drawPanel(){
        myBuffer.setColor(Color.decode("#EEEEEE"));
        myBuffer.fillRect(0, 0, N, N);
        ImageIcon myPortrait = new ImageIcon("acceljam/Resources/Materials/circle.png");
        myBuffer.drawImage(myPortrait.getImage(), 200, 150,
                                   200 , 266, null);
        getCarToView();
        myBuffer.setColor(Color.BLACK);
        drawStats();
    }
    private void getCarToView(){}
    private void drawStats(){}
    private void getCars(){
    }
}
