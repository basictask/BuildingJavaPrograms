/*
This is a program to demonstrate the manipulation of custom colors
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class ColorGradient {
    public static final int RECTS = 32;
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(256, 256);
        panel.setBackground(new Color(255, 128, 0));
        Graphics g = panel.getGraphics();
        for(int i = 0; i<RECTS; i++){
            int shift = i * 256 / RECTS;
            g.setColor(new Color(shift, shift, shift));
            g.fillRect(shift, shift, 20, 20);
        }
    }
}
