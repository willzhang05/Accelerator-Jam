import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;

public class SmartVehicleGenerator{

   private int height;
   private int leftBound = 97;
   private int rightBound = 503;
   private int lanes = 4;
   private ArrayList<SmartVehicleObject> vehicles = new ArrayList<SmartVehicleObject>();
   private int nextVehicleID = 0;
   private Graphics myBuffer;
   public PlayerObject player;

   public SmartVehicleGenerator(int startHeight, Graphics startBuffer, PlayerObject startPlayer){
      height = startHeight;
      myBuffer = startBuffer;
      player = startPlayer;
   }

   public void update(){
      if (Math.random()<.05){
         int num = (int)Math.floor(Math.random()*4);
         vehicles.add(new SmartVehicleObject(leftBound + (rightBound-leftBound)/lanes*num +10,
                                             height, (rightBound-leftBound)/lanes - 2, 105, "Vehicles\\van.png"));
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