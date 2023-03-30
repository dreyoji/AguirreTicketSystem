/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyApp;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class FrameCenter { 
    public static void centerJFrame(JFrame frameToCenter){
        Rectangle screenSize = frameToCenter.getGraphicsConfiguration().getBounds();
        int x = Math.round(screenSize.width / 2 - frameToCenter.getWidth() / 2);
        int y = Math.round(screenSize.height / 2 - frameToCenter.getHeight() / 2);
        frameToCenter.setLocation(x, y);
    }
    
}
