package acceljam;

import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;

public class SmartVehicleHandler{

   private int height;
   private int leftBound = 97;
   private int rightBound = 503;
   private Lane laneOne = Lane();
   private Lane laneTwo = Lane();
   private Lane laneThree = Lane();
   private Lane laneFour = Lane();
   private ArrayList<SmartVehicleObject> vehicles = new ArrayList<SmartVehicleObject>();
   private int nextVehicleID = 0;
//   private int laneWidth = leftBound + (rightBound-leftBound)/lanes;
   private Graphics myBuffer;
   public PlayerObject player;


   public SmartVehicleHandler(PlayerObject startPlayer, Graphics startBuffer, int startHeight){//Constructor
      height = startHeight;
      myBuffer = startBuffer;
      player = startPlayer;
   }

   public void update(){                                                                       //move and draw vehicles
      for(SmartVehicleObject vehicle: getVehicles()){
         vehicle.moveRelativeTo(player);
         vehicle.draw(myBuffer);
      }
   }
/*
   public void createVehicle(Lane lane, VehicleType vehicleType){                               //
      vehicles.add(new SmartVehicleObject(laneWidth*(lane-1)+10, height, vehicleType));
      vehicles.get(nextVehicleID).setSpeed(10);
      nextVehicleID += 1;
   }
*/
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

   private class Lane{
      private int median;
      private SmartVehicleObject firstVehicle;
      private SmartVehicleObject secondVehicle;

      public Lane(int startMedian){
         median = startMedian;
      }

      public void putVehicle(){
         
      }

      public SmartVehicleObject getSecondVehicle(){
         return secondVehicle;
      }

      public void setSecondVehicle(SmartVehicleObject newSecondVehicle){
         secondVehicle = newSecondVehicle;
      }

      public SmartVehicleObject getFirstVehicle(){
         return firstVehicle;
      }

      public void setFirstVehicle(SmartVehicleObject newFirstVehicle){
         firstVehicle = newFirstVehicle;
      }
   }
}



