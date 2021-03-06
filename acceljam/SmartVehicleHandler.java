package acceljam;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class SmartVehicleHandler{

   private int height;
   private Lane laneOne = new Lane(148);
   private Lane laneTwo = new Lane(249);
   private Lane laneThree = new Lane(351);
   private Lane laneFour = new Lane(452);
   private ArrayList<SmartVehicleObject> vehicles = new ArrayList<SmartVehicleObject>();   
   private int nextVehicleID = 0;
   private Graphics myBuffer;
   public PlayerObject player;
   private Random random = new Random();

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
      generateVehicles();
   }

   public void generateVehicles(){
      if(random.nextInt(100)>98)
         laneOne.putVehicle();
      if(random.nextInt(100)>98)
         laneTwo.putVehicle();
      if(random.nextInt(100)>98)
         laneThree.putVehicle();
      if(random.nextInt(100)>98)
         laneFour.putVehicle();
   }

   public SmartVehicleObject[] getVehicles(){
      SmartVehicleObject[] returnList = {};
      returnList = vehicles.toArray(returnList);
      return returnList;
   }

   public void addVehicle(SmartVehicleObject newSmartVehicleObject){
       vehicles.add(newSmartVehicleObject);
   }

   public int getHeight(){
      return height;
   }
   public void setHeight(int newHeight){
      height = newHeight;
   }

   public class Lane{
      private int median;
      private SmartVehicleObject firstVehicle = new SmartVehicleObject(0, 99999, new VehicleData());
      private SmartVehicleObject secondVehicle = new SmartVehicleObject(0, height, new VehicleData());

      public Lane(int startMedian){
         median = startMedian;
      }

      public void putVehicle(){
         if (firstVehicle.getY()>height+secondVehicle.getHeight()){
             firstVehicle = secondVehicle;
             addVehicle(firstVehicle);
             vehicles.get(nextVehicleID).setX(median-vehicles.get(nextVehicleID).getWidth()/2);
             vehicles.get(nextVehicleID).setSpeed(15);
             vehicles.get(nextVehicleID).setY(height);
             nextVehicleID += 1;
             secondVehicle = new SmartVehicleObject(0, height, new VehicleData());
         }
      }
   }
}