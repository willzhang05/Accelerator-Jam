package acceljam;

import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.lang.reflect.*;

public class ObjectFactory<T1 extends RelativeObject>{
    private int height;
    private Lane laneOne = new Lane(148);
    private Lane laneTwo = new Lane(249);
    private Lane laneThree = new Lane(351);
    private Lane laneFour = new Lane(452);
    private ArrayList<T1> objects = new ArrayList<T1>();
    private int nextObjectID = 0;
    private Graphics myBuffer;
    public PlayerObject player;
    private Random random = new Random();

    public ObjectFactory(PlayerObject startPlayer, Graphics startBuffer, int startHeight){//Constructor
        height = startHeight;
        myBuffer = startBuffer;
        player = startPlayer;
    }
    public void update(){                                                                       //move and draw vehicles
        for(T1 object: getObjects()){
            object.moveRelativeTo(player);
            object.draw(myBuffer);
        }
        generateObjects();
    }

    public void generateObjects(){
        if(random.nextInt(100)>98)
            laneOne.putObject();
        if(random.nextInt(100)>98)
            laneTwo.putObject();
        if(random.nextInt(100)>98)
            laneThree.putObject();
        if(random.nextInt(100)>98)
            laneFour.putObject();
    }

    public T1[] getObjects(){
        T1[] returnList;
        returnList = objects.toArray(returnList);
        return returnList;
    }

    public void addObject(T1 newObject){
        objects.add(newObject);
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int newHeight){
        height = newHeight;
    }

    private class Lane{
        private int median;
        if()


        public Lane(int startMedian, Method creationMethod){
            firstObject = creationMethod.invoke(null, null);
            secondObject = creationMethod.invoke(null, null);
            median = startMedian;
        }

        public void putObject(){
            if (firstObject.getY()>height+secondObject.getHeight()){
                firstObject = secondObject;
                addObject(firstObject);
                objects.get(nextObjectID).setX(median-objects.get(nextObjectID).getWidth()/2);
                objects.get(nextObjectID).setSpeed(15);
                objects.get(nextObjectID).setY(height);
                nextObjectID += 1;
                secondObject = new T1(0, height, new VehicleData());
            }
        }

        public T1 getSecondObject(){
            return secondObject;
        }
        public void setSecondObject(T1 newSecondObject){
            secondObject = newSecondObject;
        }
        public T1 getFirstObject(){
            return firstObject;
        }
        public void setFirstObject(T1 newFirstObject){
            firstObject = newFirstObject;
        }
    }
    
    
    public SmartVehicleObject newSmartVehicleObject(){
        return new SmartVehicleObject(0, height, new VehicleData());
    }
}