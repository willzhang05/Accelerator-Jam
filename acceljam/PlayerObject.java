package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public class PlayerObject extends VehicleObject{

   public PlayerObject(int startX, int startY, VehicleType data){
      super(startX, startY, data);
   }

   public void moveDirection(int frameNumber){                                                    //Player
      if(getX()+getDirection()*getHandlingSpeed()<getLeftBound()){
         setX(getLeftBound());
      }
      else if(getX()+getDirection()*getHandlingSpeed()+getWidth()>getRightBound()){
         setX(getRightBound()-getWidth());
      }
      else{
         setX(getX()+getDirection()*getHandlingSpeed());
      }

      if (getHandlingSpeed() + getHandlingAcceleration() <= getTopHandlingSpeed()){
         if (frameNumber%10 == 0)
            setHandlingSpeed(getHandlingSpeed() + getHandlingAcceleration());
      }
      else
         setHandlingSpeed(getTopHandlingSpeed());
   }
   
   public boolean checkDeath(SmartVehicleHandler handler){
      SmartVehicleObject[] vehicles = handler.getVehicles();
      for (SmartVehicleObject vehicle : vehicles){
         if(checkCollision(vehicle))
            return true;
      }
      return false;
   }
}