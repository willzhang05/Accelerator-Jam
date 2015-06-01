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
   private Graphics myBuffer;
   public PlayerObject player;

   public SmartVehicleHandler(PlayerObject startPlayer, Graphics startBuffer, int startHeight){
      height = startHeight;
      myBuffer = startBuffer;
      player = startPlayer;
   }

   public void update(){
      if (Math.random()<.05){
         int num = (int)Math.floor(Math.random()*4);
         vehicles.add(new SmartVehicleObject(leftBound + (rightBound-leftBound)/lanes*num +10, height, new VehicleType()));
         vehicles.get(nextVehicleID).setSpeed((int)Math.floor(Math.random()*10));
         nextVehicleID += 1;
      }
      for(SmartVehicleObject vehicle: getVehicles()){
         vehicle.moveRelativeTo(player);
         vehicle.draw(myBuffer);
      }
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