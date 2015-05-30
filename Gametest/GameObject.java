import javax.swing.*;
import java.awt.Graphics;

public abstract class GameObject{

   private int speed = 0;
   private String imageName;
   private int x;
   private int y;
   private int width;
   private int height;

   public GameObject(int startX, int startY, int startWidth, int startHeight, String image){     //Constructor
      x = startX;
      y = startY;
      width = startWidth;
      height = startHeight;
      imageName = image;
   }

   public abstract void drawObj(Graphics pen);

   public void moveX(int dx){                  //Move
      x += dx;
   }
   
   public void moveY (int dy){
      y += dy;
   }
   
   public void move(int dx, int dy){
      x += dx;
      y += dy;
   }

   public int getX(){                            //Get dimensions
      return x;
   }

   public int getY(){
      return y;
   }

   public int getWidth(){
      return width;
   }
   
   public int getHeight(){
      return height;
   }
   
   public void setX(int newX){                            //Set dimensions
      x = newX;
   }

   public void setY(int newY){
      y = newY;
   }

   public void setWidth(int newWidth){
      width = newWidth;
   }
   
   public void setHeight(int newHeight){
      height = newHeight;
   }

   public void setSpeed(int newSpeed){                                                            //Everyone
      speed = newSpeed;
   }

   public int getSpeed(){
      return speed;
   }
   
   public String getImageName(){
      return imageName;
   }
   
   public void setImageName(String newImageName){
      imageName = newImageName;
   }
}