import javax.swing.*;
import java.awt.Graphics;

public class RelativeObject extends GameObject{
   private int speed = 0;
   private String imageName;

   public RelativeObject(int startX, int startY, int startWidth, int startHeight, String image){
      super(startX, startY, startWidth, startHeight);
      imageName = image;
   }



   public void drawObj(Graphics myBuffer){
      ImageIcon myPortrait = new ImageIcon(imageName);
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

   public void moveRelativeTo(RelativeObject anchor){
        moveY(anchor.getSpeed()-speed);
   }
   
   public void setSpeed(int newSpeed){
      speed = newSpeed;
   }

   public int getSpeed(){
      return speed;
   }   
}