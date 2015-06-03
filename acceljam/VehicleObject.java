package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public class VehicleObject extends RelativeObject{

   public VehicleType data;
   public int RIGHT = 1;
   public int LEFT = -1;
   public int NO_DIR = 0;
   private int direction = NO_DIR;
   private int leftBound = 97;
   private int rightBound = 503;

   public VehicleObject(int startX, int startY, VehicleType startData){
      super(startX, startY, startData.getWidth(), startData.getHeight(), startData.getImagePath());
      data = startData;
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