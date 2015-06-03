package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GameOverPanel extends SmartPanel{
    public final int N = 600;

    public GameOverPanel(JFrame frame){
        super(frame);
        setFocusable(true);
    }

    public void paintComponent(Graphics pen){}
 }