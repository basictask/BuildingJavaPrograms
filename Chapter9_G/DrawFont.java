/*
This is a program to demonstrate creating fonts on the DrawingPanel object
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class DrawFont {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.red);
        g.setFont(new Font("Monospaced", Font.BOLD+Font.ITALIC, 36));
        g.drawString("TooBig", 20, 40);
        
        g.setFont(new Font("SansSerif", Font.PLAIN, 10));
        g.drawString("TooSmall", 30, 60);
        
        g.setFont(new Font("Serif", Font.ITALIC, 20));
        g.drawString("JustRight", 40, 80);
    }
}
