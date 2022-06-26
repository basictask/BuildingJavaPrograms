/*
This is a basic program to draw a line
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class DrawLine1 {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();
        g.drawLine(15,75, 175, 25);
    }
}