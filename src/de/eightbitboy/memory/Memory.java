package de.eightbitboy.memory;

import java.awt.Color;

import javax.swing.JFrame;

public class Memory {
	public static void main(String[] args) {
		System.out.println("Hello Stefanie!");

		JFrame frame = new JFrame("Memory");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);

		Color frameBackground = new Color(231, 235, 202);

		frame.getContentPane().setBackground(frameBackground);
		frame.setVisible(true);
	}
}
