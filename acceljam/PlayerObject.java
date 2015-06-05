package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public class PlayerObject extends VehicleObject{
   private boolean impacted = false;
   
   public PlayerObject(int startX, int startY, VehicleType data){
      super(startX, startY, data);
   }

   public void moveDirection(int frameNumber){                                                    //Player
      if(getX()+getDirection()*getHandlingSpeed()<getLeftBound()){
         setX(getLeftBound());
         makeRoadImpact();
         setSpeed(getMinSpeed());
      }
      else if(getX()+getDirection()*getHandlingSpeed()+getWidth()>getRightBound()){
         setX(getRightBound()-getWidth());
         makeRoadImpact();
         setSpeed(getMinSpeed());
      }
      else{
         setX(getX()+getDirection()*getHandlingSpeed());
         impacted = false;
      }
      updateHandlingSpeed(frameNumber);
   }

   public void updateHandlingSpeed(int frameNumber){
      if (getHandlingSpeed() + getHandlingAcceleration() <= getTopHandlingSpeed()){
         if (frameNumber%10 == 0){
            setHandlingSpeed(getHandlingSpeed() + getHandlingAcceleration());
         }
      }
      else{
         setHandlingSpeed(getTopHandlingSpeed());
      }
   }
   
   public boolean checkDeath(SmartVehicleHandler handler){
      SmartVehicleObject[] vehicles = handler.getVehicles();
      for (SmartVehicleObject vehicle : vehicles){
         if(checkCollision(vehicle))
            return true;
      }
      return false;
   }
   
   public void makeRoadImpact(){
      if(!impacted){
         Sound bonk = new Sound("roadImpact.wav");
         bonk.play();
         impacted = true;
      }
   }
}