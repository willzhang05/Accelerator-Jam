//Name: William Zhang
//Date: 5/21/15
//Custom Font Support
package acceljam;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public class CustomFont extends Font {
    public CustomFont(String path, int style, int size){
        super(path, style, size);
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(path));
            font = font.deriveFont(Font.PLAIN, size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        } catch(Exception e){
            e.printStackTrace();
        }
   }
}