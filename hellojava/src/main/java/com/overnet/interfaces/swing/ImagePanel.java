package com.overnet.interfaces.swing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	private BufferedImage image;
	
	
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public ImagePanel() throws IOException {
		image = ImageIO.read(new File("C:\\Users\\Administrator\\git\\corsojava2019\\pages\\img\\interview.png"));
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }
}
