package com.training.an.grow.ScreenshotMaker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotMaker {

    public static void takeScreenshot(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        try {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(screenSize.width*2, screenSize.height*2));
            String fileName = directoryPath + "/" + System.currentTimeMillis() + ".png";
            ImageIO.write(image, "png", new File(fileName));
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

    }
}