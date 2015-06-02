import java.util.Scanner;
import java.io.*;

public class VehicleType{

   private int width = 40;
   private int height = 70;
   private int acceleration = 3;
   private int minSpeed = 10;
   private int topSpeed = 70;
   private int topHandlingSpeed = 3;
   private int minHandlingSpeed = 1;
   private String imagePath = "Resources\\Vehicles\\blank.png";
   private String name;

   public VehicleType(String startName){
      name = startName;
      readData();
   }

   public VehicleType(){
      name = "blank";
   }

   public void readData(){
      try{
         Scanner reader = new Scanner(new File("Vehicles\\VehicleInfo\\"+name+".vehicle"));

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
            else if (nextData.equals("imagePath"))
               setImagePath(reader.next());
         }
      }catch(Exception FileNotFoundException){
         System.out.println("Non-existant file path followed.");
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