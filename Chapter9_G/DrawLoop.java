/*
This program draws shapes using a loop
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class DrawLoop {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.CYAN);
        
        for(int i = 0; i < 4; i++){
            g.setColor(Color.WHITE);
            g.fillOval(i*50, i*25, 50, 25);
            g.setColor(Color.YELLOW);
            g.drawRect(i*50, i*25, 50, 25);
        }
    }
}
