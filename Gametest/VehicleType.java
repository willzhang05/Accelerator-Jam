import java.util.Scanner;
import java.io.*;

public class VehicleType{

   private int width;
   private int height;
   private int acceleration;
   private int minSpeed;
   private int topSpeed;
   private int topHandlingSpeed;
   private int minHandlingSpeed;
   private String imagePath;
   private String name;

   public VehicleType(String startName){
      name = startName;
      readData();
      System.out.println(getWidth());
   }
   
   public static void main(String[] args){
      new VehicleType("Taxi");
   }
   
   public void readData(){
      try{
         Scanner reader = new Scanner(new File("Vehicles\\VehicleInfo\\"+name+".vehicle"));

         while(reader.hasNext()){
            String nextData = reader.next();
            System.out.println(nextData);

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