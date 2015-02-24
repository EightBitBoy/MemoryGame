package de.eightbitboy.memory;

import java.awt.Color;

import javax.swing.JFrame;

public class Memory {
	private final static Color FRAME_BACKGROUND = new Color(231, 235, 202);

	private final static int LOCATION = 400;

	private final static int SIZE = 400;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Memory");
		frame.setLocation(LOCATION, LOCATION);
		frame.setSize(SIZE, SIZE);
		frame.getContentPane().setBackground(FRAME_BACKGROUND);
		frame.setVisible(true);
	}
}
