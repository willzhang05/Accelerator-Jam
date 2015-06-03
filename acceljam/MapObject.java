package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public class MapObject extends RelativeObject{


   public MapObject(int N, String image){
      super(0, 0, N, N, "Roads\\"+image);
   }

   public void draw(Graphics myBuffer){                                                         //Background object
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
}