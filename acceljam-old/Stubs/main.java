package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame{
/**
@author William Zhang
@version 0.0.1
**/
    public main(){
		/**
		* The main class is a base for each individual screen in the program.
		* The main class extends Java Swing JFrame.
		@see javax.swing.JFrame
		* The main class has a window size of 800x600
		**/
        super();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
		/**
		* Instantiates program base
		**/
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run(){
                main frame = new main();
                frame.setVisible(true);
            }
        });
    }
}