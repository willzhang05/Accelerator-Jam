package acceljam;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class Sound{

  private URL file;
  private AudioInputStream audioIn;
  private Clip clip;
  private FloatControl gainControl;
  
  public Sound(String startFile){
    try{
      file = this.getClass().getClassLoader().getResource("acceljam/Resources/audio/"+startFile);
      audioIn = AudioSystem.getAudioInputStream(file);
      clip = AudioSystem.getClip();
      clip.open(audioIn);
      gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    } catch (UnsupportedAudioFileException exception) {
       exception.printStackTrace();
    } catch (IOException exception) {
       exception.printStackTrace();
    } catch (LineUnavailableException exception) {
       exception.printStackTrace();
    }
  }

  public void play(){
     clip.start();
  }

  public void loop(int repetitions){
     clip.loop(repetitions - 1);
  }

  public void loop(){
     clip.loop(Clip.LOOP_CONTINUOUSLY);
  }

  public void stop(){
     if(clip.isRunning())
        clip.stop();
  }

  public boolean isRunning(){
     return clip.isRunning();
  }

  public void reset(){
     clip.setFramePosition(0);
  }

  public void changeVolume(float decibels){
     gainControl.setValue(decibels);
  }

  public static void main(String[] args) throws Exception {
     Sound test = new Sound("test.wav");
     test.loop(1);
     Thread.sleep(7000);
  }

}
