package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class options extends main{
/**
@author William Zhang
@version 0.0.1
**/
	public options(){
		/**
		* Class options extends main.
		@see main
		* Screen to show after key "p" is pressed in gamePanel
		@see gamePanel
		**/
        super();
	}
	public JButton exitButton(){
		/**
		* On button click, return to pauseMenu and options menu hides 
		@see pauseMenu
		@return the exitButton
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
    public JButton soundIncButton(){
		/**
		* On button click, increase program audio volume.
		@return the soundIncButton
		* Utilizes ActionListener.
		@see ActionListener
		**/
        JButton qB = new JButton("+");
        qB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            }
        });
        return qB;
    }
	public JButton soundDecButton(){
		/**
		* On button click, decrease program audio volume.
		@return the soundDecButton
		* Utilizes ActionListener.
		@see ActionListener
		**/
        JButton qB = new JButton("-");
        qB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
            }
        });
        return qB;
    }
}