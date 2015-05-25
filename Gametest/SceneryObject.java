public class SceneryObject extends GameObject
{
   private int x0;
   private int y0;
   private int x1;
   private int y1;
   private int speed = 0;
   private String imageName;
   private ImageIcon myPortrait;

   public SceneryObject(int startx0, int starty0, int startx1, int starty1, String image)
   {
      super(startx0, starty0, startx1, starty1);
      imageName = image;
      myPortrait = new ImageIcon(imageName);
   }


   public void draw(Grahpics pen)
   {

        pen.drawImage(myPortrait.getImage(), x0, y0, x1, y1, null);
   }

   public void moveRelativeTo(PlayerVehicle car)


}