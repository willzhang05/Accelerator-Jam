package acceljam;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class RelativeObject extends GameObject{
    Color originalColor;
    public RelativeObject(int startX, int startY, int startWidth, int startHeight, String image){
        super(startX, startY, startWidth, startHeight, image);
    }

    public void draw(Graphics myBuffer){                                                       //Vehicle
        ImageIcon myPortrait = new ImageIcon(getImagePath());
        myBuffer.drawImage(myPortrait.getImage(), getX(), getY(), getWidth() , getHeight(), null);
    }
    public void moveRelativeTo(GameObject anchor){                                             //Relative object
        setY(getY()+anchor.getSpeed()-getSpeed());
    }
}