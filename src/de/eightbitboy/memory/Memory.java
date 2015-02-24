package de.eightbitboy.memory;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Memory {
	private final static Color FRAME_BACKGROUND = new Color(231, 235, 202);

	private final static int LOCATION = 400;

	private final static int SIZE = 400;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Memory");
		frame.setLocation(LOCATION, LOCATION);
		frame.setSize(SIZE, SIZE);
		frame.getContentPane().setBackground(FRAME_BACKGROUND);

		try {
			File file = new File("E:\\Dev\\MemoryGame\\img\\lasagne.jpg");
			BufferedImage image = ImageIO.read(file);
			ImageIcon icon = new ImageIcon(image);
			JLabel label = new JLabel(icon);
			frame.add(label);
		} catch (IOException e) {
			e.printStackTrace();
		}

		frame.setVisible(true);
	}
}
