package acceljam;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class VehicleSelectorPanel extends SmartPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1593976398698918460L;
	private BufferedImage myImage;
    private Graphics myBuffer;
    private final int N = 600;
    private int circleX = 150; //300 is center
    private int circleY = circleX * 3 / 4;
    private int circleWidth = N - 2 * circleX;
    private int circleHeight = N - 2 * circleY;
    private String[] vehicles = {"boxvan", "coupe", "flatbed",
                                 "hatch", "luxury", "pickup1",
                                 "pickup2", "taxi", "van"};
    private int currentVehicle = 2;
    private VehicleData currentVehicleData;

    public VehicleSelectorPanel(JFrame startFrame){
        super(startFrame);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        setFocusable(true);
    }
    public void paintComponent(Graphics pen){
        myBuffer.setColor(Color.decode("#DDDDDD"));
        myBuffer.fillRect(0, 0, N, N);
//        ImageIcon platform = new ImageIcon("acceljam/Resources/Materials/circle.png");
//        myBuffer.drawImage(platform.getImage(), circleX, circleY,
//                                 circleWidth , circleHeight, null);
        myBuffer.setColor(Color.white);
        myBuffer.fillOval(circleX, circleY, circleWidth , circleHeight);
        currentVehicleData = new VehicleData(vehicles[currentVehicle]);
        ImageIcon carToDisplay = new ImageIcon(currentVehicleData.getImagePath());
        myBuffer.drawImage(carToDisplay.getImage(), N/2-currentVehicleData.getWidth()/2, 
                           N/2-currentVehicleData.getHeight()/2, currentVehicleData.getWidth(), currentVehicleData.getHeight(), null);
        myBuffer.setColor(Color.black);

        myBuffer.setFont(new Roboto(1, 40));
        myBuffer.drawString("Top Speed: "+currentVehicleData.getTopSpeed(), 10, 500);
        myBuffer.drawString("Acceleration: "+currentVehicleData.getAcceleration(), 10, 520);
        myBuffer.drawString("Top Turn Speed"+currentVehicleData.getTopHandlingSpeed(), 10, 540);

        pen.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }
}

//      changePanel(new GamePanel(getFrame(), 30));