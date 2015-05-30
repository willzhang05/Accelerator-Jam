import javax.swing.*;
import java.awt.Graphics;

public class VehicleObject extends RelativeObject{

   public int RIGHT = 1;
   public int LEFT = -1;
   public int NO_DIR = 0;
   private int direction = NO_DIR;
   private int leftBound = 97;
   private int rightBound = 503;

   public VehicleObject(int startX, int startY, int startWidth, int startHeight, String image){
      super(startX, startY, startWidth, startHeight, image);
   }

   public int getDirection(){
      return direction;
   }

   public void setDirection(int newDirection){
      direction = newDirection;
   }
   
   public void setLeftBound(int newLeftBound){
      leftBound = newLeftBound;
   }
   
   public int getLeftBound(){
      return leftBound;
   }
   
   public void setRightBound(int newRightBound){
      rightBound = newRightBound;
   }
   
   public int getRightBound(){
      return rightBound;
   }
}   