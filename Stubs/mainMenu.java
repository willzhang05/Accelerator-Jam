package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends main{
/**
@author William Zhang
@version 0.0.1
**/
    public mainMenu(){
		/**
		* Class mainMenu extends main.
		@see main
		* First main screen to show. 
		**/
        super();
        //super.setTitle("Main Menu");
        //super.add(startButton());
        //super.add(quitButton());
    }
    public JButton startButton(){
		/**
		* On button click, a new gamePanel is instantiated and replaces mainMenu.
		@see gamePanel
		* Utilizes ActionListener.
		**/
        JButton sB = new JButton("Start");
        sB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
            }
        });
        return sB;
    }
    public JButton quitButton(){
		/**
		* On button click, exit the program.
		@see System
		* Utilizes ActionListener.
		**/
        JButton qB = new JButton("Quit");
        qB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        return qB;
    }
}
