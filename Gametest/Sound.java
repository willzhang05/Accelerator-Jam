import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class Sound{

  private URL file;
  private AudioInputStream audioIn;
  private Clip clip;
  
  public Sound(String startFile){

    try{
      file = this.getClass().getClassLoader().getResource(startFile);
      audioIn = AudioSystem.getAudioInputStream(file);
      clip = AudioSystem.getClip();
      clip.open(audioIn);
      clip.start();
    } catch (UnsupportedAudioFileException exception) {
       exception.printStackTrace();
    } catch (IOException exception) {
       exception.printStackTrace();
    } catch (LineUnavailableException exception) {
       exception.printStackTrace();
    }
  }
  



}
