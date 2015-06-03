package acceljam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame{
    public main(){
        super();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run(){
                main frame = new main();
                frame.setVisible(true);
            }
        });
    }
}