package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public class VehicleObject extends RelativeObject{

   private VehicleData data;
   public int RIGHT = 1;
   public int LEFT = -1;
   public int NO_DIR = 0;
   private int direction = NO_DIR;
   private int leftBound = 97;
   private int rightBound = 503;
   private int handlingSpeed;
   private int handlingAcceleration;
   private int topHandlingSpeed;
   private int minHandlingSpeed;
   private int acceleration;
   private int minSpeed;
   private int topSpeed;

   public VehicleObject(int startX, int startY, VehicleData startData){
      super(startX, startY, startData.getWidth(), startData.getHeight(), startData.getImagePath());
      data = startData;
      loadFromData();
   }

   public void loadFromData(){
      setImagePath(data.getImagePath());   
      setWidth(data.getWidth());
      setHeight(data.getHeight());
      setAcceleration(data.getAcceleration());
      setMinSpeed(data.getMinSpeed());
      setTopSpeed(data.getTopSpeed());
      setTopHandlingSpeed(data.getTopHandlingSpeed());
      setMinHandlingSpeed(data.getMinHandlingSpeed());
      setHitboxMargin(data.getHitboxMargin());
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
   public void setData(VehicleData newData){
      data = newData;
   }
   public VehicleData getData(){
      return data;
   }
   public void setHandlingSpeed(int newHandling){
      handlingSpeed = newHandling;
   }
   public int getHandlingSpeed(){
      return handlingSpeed;
   }
   public void setHandlingAcceleration(int newHandlingAcceleration){
      handlingAcceleration = newHandlingAcceleration;
   }
   public int getHandlingAcceleration(){
      return handlingAcceleration;
   }
   public void setMinHandlingSpeed(int newMinHandlingSpeed){
      minHandlingSpeed = newMinHandlingSpeed;
   }
   public int getMinHandlingSpeed(){
      return minHandlingSpeed;
   }
   public void setTopHandlingSpeed(int newTopHandlingSpeed){
      topHandlingSpeed = newTopHandlingSpeed;
   }
   public int getTopHandlingSpeed(){
      return topHandlingSpeed;
   }
   public int getAcceleration(){
      return acceleration;
   }
   public void setAcceleration(int newAcceleration){
      acceleration = newAcceleration;
   }
   public void setTopSpeed(int newTopSpeed){
      topSpeed = newTopSpeed;
   }
   public int getTopSpeed(int newTopSpeed){
      return topSpeed;
   }
   public void setMinSpeed(int newMinSpeed){
      minSpeed = newMinSpeed;
   }
   public int getMinSpeed(){
      return minSpeed;
   }
}