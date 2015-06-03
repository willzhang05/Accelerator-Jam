package acceljam;

import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;

public class SmartVehicleHandler{

   private int height;
   private int leftBound = 97;
   private int rightBound = 503;
   private int lanes = 4;
   private ArrayList<SmartVehicleObject> vehicles = new ArrayList<SmartVehicleObject>();
   private int nextVehicleID = 0;
   private int laneWidth = leftBound + (rightBound-leftBound)/lanes;
   private Graphics myBuffer;
   public PlayerObject player;


   public SmartVehicleHandler(PlayerObject startPlayer, Graphics startBuffer, int startHeight){
      height = startHeight;
      myBuffer = startBuffer;
      player = startPlayer;
   }

   public void update(){
      for(SmartVehicleObject vehicle: getVehicles()){
         vehicle.moveRelativeTo(player);
         vehicle.draw(myBuffer);
      }
   }

   public void createVehicle(int lane, VehicleType vehicleType){
      vehicles.add(new SmartVehicleObject(laneWidth*(lane-1)+10, height, vehicleType));
      vehicles.get(nextVehicleID).setSpeed(10);
      nextVehicleID += 1;
   }

   public SmartVehicleObject[] getVehicles(){
      SmartVehicleObject[] returnList = {};
      returnList = vehicles.toArray(returnList);
      return returnList;
   }

   public int getHeight(){
      return height;
   }
   
   public void setHeight(int newHeight){
      height = newHeight;
   }

   public int getLeftBound(){
      return leftBound;
   }
   
   public void setLeftBound(int newLeftBound){
      leftBound = newLeftBound;
   }

   public int getRightBound(){
      return rightBound;
   }
   
   public void setRightBound(int newRightBound){
      rightBound = newRightBound;
   }

   public int getLanes(){
      return lanes;
   }
   
   public void set(int newLanes){
      lanes = newLanes;
   }
}
