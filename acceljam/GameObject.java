package acceljam;

import javax.swing.*;
import java.awt.Graphics;

public abstract class GameObject{

   private int speed = 0;
   private String imageName = "acceljam\\Resources\\";
   private int x;
   private int y;
   private int width;
   private int height;

   public GameObject(int startX, int startY, int startWidth, int startHeight, String startImage){     //Constructor
      x = startX;
      y = startY;
      width = startWidth;
      height = startHeight;
      imageName += startImage;
   }

   public abstract void draw(Graphics myBuffer);

   public boolean checkCollision(GameObject rect){
      if(x>rect.getX()+rect.getWidth() || x+width<rect.getX())
         return false;
      if(y>rect.getY()+rect.getHeight() || y+height<rect.getY())
         return false;
      return true;
   }

   public void moveX(int dx){
      x += dx;
   }
   
   public void moveY (int dy){
      y += dy;
   }
   
   public void move(int dx, int dy){
      x += dx;
      y += dy;
   }

   public int getX(){
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
   
   public void setX(int newX){
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