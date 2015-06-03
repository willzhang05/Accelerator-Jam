package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public class RelativeObject extends GameObject{

   public RelativeObject(int startX, int startY, int startWidth, int startHeight, String image){
      super(startX, startY, startWidth, startHeight, image);
   }

   public void draw(Graphics myBuffer){                                                       //Vehicle
      ImageIcon myPortrait = new ImageIcon(getImageName());
      myBuffer.drawImage(myPortrait.getImage(), getX(), getY(),
                                                getWidth() , getHeight(), null);
   }

   public void moveRelativeTo(GameObject anchor){                                             //Relative object
        moveY(anchor.getSpeed()-getSpeed());
   }

   
}

