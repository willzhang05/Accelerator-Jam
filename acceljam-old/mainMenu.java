package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends main{
    public mainMenu(){
        super();
        //super.setTitle("Main Menu");
        //super.add(startButton());
        //super.add(quitButton());
    }
    public JButton startButton(){
        JButton sB = new JButton("Start");
        sB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        return sB;
    }
    public JButton quitButton(){
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
