import javax.swing.*;
import java.awt.Graphics;

public class RelativeObject extends GameObject{

   public RelativeObject(int startX, int startY, int startWidth, int startHeight, String image){
      super(startX, startY, startWidth, startHeight, image);
   }



   public void drawBg(Graphics myBuffer){                                                         //Background object
      ImageIcon myPortrait = new ImageIcon(getImageName());
      myBuffer.drawImage(myPortrait.getImage(), getX(), getY(),
                                                getWidth() , getHeight(), null);
      if (getY()>=0){
         myBuffer.drawImage(myPortrait.getImage(), getX(), getY()-getHeight(),
                                                getWidth() , getHeight(), null);
      }
      
      if (getY()>=600){
         setY(getY()-getHeight());
      }
   }

   public void drawObj(Graphics myBuffer){                                                        //Vehicle      
      ImageIcon myPortrait = new ImageIcon(getImageName());
      myBuffer.drawImage(myPortrait.getImage(), getX(), getY(),
                                                getWidth() , getHeight(), null);
   }

   public void moveRelativeTo(GameObject anchor){                                             //Relative object
        moveY(anchor.getSpeed()-getSpeed());
   }

   
}