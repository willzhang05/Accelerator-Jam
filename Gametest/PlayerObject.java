import javax.swing.*;
import java.awt.Graphics;

public class PlayerObject extends VehicleObject{

   private int handlingSpeed = 0;
   private int handlingAcceleration = 1;
   private int topHandlingSpeed = 30;
   private int minHandlingSpeed = 1;

   public PlayerObject(int startX, int startY, VehicleType data){
      super(startX, startY, data);
   }

   public void moveDirection(int frameNumber){                                                    //Player
      if(getX()+getDirection()*handlingSpeed<getLeftBound()){
         setX(getLeftBound());
      }
      else if(getX()+getDirection()*handlingSpeed+getWidth()>getRightBound()){
         setX(getRightBound()-getWidth());
      }
      else{
         setX(getX()+getDirection()*handlingSpeed);
      }

      if (handlingSpeed + handlingAcceleration <= topHandlingSpeed){
         if (frameNumber%10 == 0)
            handlingSpeed += handlingAcceleration;
      }
      else
         handlingSpeed = topHandlingSpeed;
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












}