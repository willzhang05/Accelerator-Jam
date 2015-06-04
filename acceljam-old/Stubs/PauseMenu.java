package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pauseMenu extends main{
/**
@author William Zhang
@version 0.0.1
**/
	public pauseMenu(){
		/**
		* Class options extends main.
		@see main
		* Screen to show after key "p" is pressed in gamePanel
		@see gamePanel
		**/
        super();
	}
	public JButton resumeButton(){
		/**
		* On button click, a gamePanel resumes state, and options menu hides 
		@see gamePanel
		@return the resumeButton
		* Utilizes ActionListener.
		@see ActionListener
		**/
        JButton sB = new JButton("Resume");
        sB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
            }
        });
        return sB;
    }
	public JButton optButton(){
		/**
		* On button click, create new options panel
		@see options
		@return the optButton
		* Utilizes ActionListener.
		@see ActionListener
		**/
        JButton qB = new JButton("Options");
        qB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                
            }
        });
        return qB;
    }
    public JButton quitButton(){
		/**
		* On button click, exit the program.
		@see System
		@return the quitButton
		* Utilizes ActionListener.
		@see ActionListener
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