package acceljam;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class VehicleData{

   private int width = 40;
   private int height = 70;
   private int acceleration = 3;
   private int minSpeed = 10;
   private int topSpeed = 70;
   private int topHandlingSpeed = 3;
   private int minHandlingSpeed = 1;
   private int hitboxMargin = 4;
   private String imagePath = "acceljam/Resources/Vehicles/";
   private String name;
   private static String[] vehicleOptions = {"boxvan", "coupe", "flatbed", "hatch", 
                                      "luxury", "pickup1", "pickup2", "taxi",
                                      "van"};

   public VehicleData(String startName){
      name = startName;
      loadData();
   }

   public VehicleData(){
      Random random = new Random(); 
      name = vehicleOptions[random.nextInt(vehicleOptions.length)];
      loadData();
   }

   public void loadData(){
      try{
         Scanner reader = new Scanner(new File("acceljam/Resources/Vehicles/VehicleInfo/"+name+".vehicle"));

         while(reader.hasNext()){
            String nextData = reader.next();

            if (nextData.equals("width"))
               setWidth(reader.nextInt());
            else if (nextData.equals("height"))
               setHeight(reader.nextInt());
            else if (nextData.equals("acceleration"))
               setAcceleration(reader.nextInt());
            else if (nextData.equals("minSpeed"))
               setMinSpeed(reader.nextInt());
            else if (nextData.equals("topSpeed"))
               setTopSpeed(reader.nextInt());
            else if (nextData.equals("topHandlingSpeed"))
               setTopHandlingSpeed(reader.nextInt());
            else if (nextData.equals("minHandlingSpeed"))
               setMinHandlingSpeed(reader.nextInt());
            else if (nextData.equals("hitboxMargin"))
               setHitboxMargin(reader.nextInt());
            else if (nextData.equals("imagePath"))
               setImagePath(getImagePath()+reader.next());
         }
      }catch(Exception FileNotFoundException){
         System.out.println("Non-existant file path followed: ");
         System.out.print("acceljam/Resources/Vehicles/VehicleInfo/"+name+".vehicle");
         System.exit(0);
      }
   }

   public int getWidth(){
      return width;
   }
   public void setWidth(int newWidth){
      width = newWidth;
   }
   public int getHeight(){
      return height;
   }
   public void setHeight(int newHeight){
      height = newHeight;
   }
   public int getAcceleration(){
      return acceleration;
   }
   public void setAcceleration(int newAcceleration){
      acceleration = newAcceleration;
   }
   public void setMinSpeed(int newMinSpeed){
      minSpeed = newMinSpeed;
   }
   public int getMinSpeed(){
      return minSpeed;
   }
   public int getTopSpeed(){
      return topSpeed;
   }
   public void setTopSpeed(int newTopSpeed){
      topSpeed = newTopSpeed;
   }
   public int getTopHandlingSpeed(){
      return topHandlingSpeed;
   }
   public void setTopHandlingSpeed(int newTopHandlingSpeed){
      topHandlingSpeed = newTopHandlingSpeed;
   }
   public int getMinHandlingSpeed(){
      return minHandlingSpeed;
   }
   public void setMinHandlingSpeed(int newMinHandlingSpeed){
      minHandlingSpeed = newMinHandlingSpeed;
   }
   public int getHitboxMargin(){
      return hitboxMargin;
   }
   public void setHitboxMargin(int newHitboxMargin){
      hitboxMargin = newHitboxMargin;
   }
   public String getName(){
      return name;
   }
   public void setName(String newName){
      name = newName;
   }
   public String getImagePath(){
      return imagePath;
   }
   public void setImagePath(String newImagePath){
      imagePath = newImagePath;
   }
}
