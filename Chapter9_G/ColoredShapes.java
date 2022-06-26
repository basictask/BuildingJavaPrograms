/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_G;

/**
 *
 * @author dani
 */
import java.awt.*;
public class ColoredShapes {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 100);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();
        
        g.drawRect(25, 50, 12, 4);
        g.fillRect(25, 50, 12, 4);
    }
}
