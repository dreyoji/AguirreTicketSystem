package MyApp;

import java.awt.*;
import javax.swing.*;

public class FrameCenter { 
    
    // Centers a JFrame on the screen.
    public static void centerJFrame(JFrame frameToCenter) {
        Rectangle screenSize = frameToCenter.getGraphicsConfiguration().getBounds();
        int x = Math.round(screenSize.width / 2 - frameToCenter.getWidth() / 2);
        int y = Math.round(screenSize.height / 2 - frameToCenter.getHeight() / 2);
        frameToCenter.setLocation(x, y);
    }
}
