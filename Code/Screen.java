import javax.swing.*;
import java.awt.*;

public class Screen
{

   private Graphics pen;
   private Panel panel;

   public Screen(Panel jPanel, Graphics jPanelPen)
   {  
      panel = jPanel;
      pen = jPanelPen;
   }

   public void paintComponent()
   {
      //Create GUI components
      //Bulk of code goes here
   }   

   /*Create an opaque black rectangle and 
   decrease opacity until it is black*/
   public void fadeOut(Graphics pen, r, g, b, int speed)
   {
      for(int opacity = 0; int opacity<255; opacity++)
         {
            pen.setColor(new Color(r,g,b,opacity));
            pen.drawRect(0,0,xDim,yDim);
	    //delay( 1000 * ( speed / 510 ) );


         }
   }

   public void cleanUp()
   {
      //Delete components
   }
}