/*
This is a program to manipulate a String's parameters with a loop
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class StringMessage {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 100);
        panel.setBackground(Color.YELLOW);
        Graphics g = panel.getGraphics();
        for (int i = 0; i < 10; i++) {
            g.drawString("There is no place like home", i*5, i*10);
        }
    }
}
