import javax.swing.*;

public class Vehicle extends RelativeObject
{
   private String imageName;
   private ImageIcon myPortrait;


   public Vehicle(int startX, int startY, int startWidth,
                              int startHeight, String image)
   {
      super(startX, startY, startWidth, startHeight, image);
   }

}