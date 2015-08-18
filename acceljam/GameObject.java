package acceljam;

import java.awt.Graphics;

public abstract class GameObject{
   private int speed = 0;
   private String imagePath = "acceljam/Resources/";
   private int x;
   private int y;
   private int width;
   private int height;
   private int hitboxMargin;

   public GameObject(int startX, int startY, int startWidth, int startHeight, String startImagePath){     //Constructor
      x = startX;
      y = startY;
      width = startWidth;
      height = startHeight;
      imagePath += startImagePath;
   }

   public abstract void draw(Graphics myBuffer);

   public boolean checkCollision(GameObject rect){
      if(x+getHitboxMargin() > rect.getX() + rect.getWidth() - rect.getHitboxMargin() || x + width-getHitboxMargin()<rect.getX()+rect.getHitboxMargin())
         return false;
      if(y > rect.getY() + rect.getHeight() || y + height < rect.getY() )
         return false;
      return true;
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

   public void setSpeed(int newSpeed){
      speed = newSpeed;
   }

   public int getSpeed(){
      return speed;
   }
   
   public int getHitboxMargin(){
      return hitboxMargin;
   }
   
   public void setHitboxMargin(int newHitboxMargin){
      hitboxMargin = newHitboxMargin;
   }
   
   public String getImagePath(){
      return imagePath;
   }
   
   public void setImagePath(String newImagePath){
      imagePath = newImagePath;
   }
}
