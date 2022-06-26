/*
This program draws a triangle onto the panel
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class DrawLine2 {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();
        g.drawLine(25, 75, 100, 25);
        g.drawLine(100, 25, 175, 75);
        g.drawLine(25, 75, 175, 75);
    }
}
