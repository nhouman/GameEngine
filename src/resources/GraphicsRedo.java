package resources;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsRedo {

	public static void main(String[] args) throws IOException {
		int height = 480, width = 640;
		JFrame frame = new JFrame("FireFly");//Create a new frame for everything
		JPanel textPanel = new JPanel();//Create a new panel for text
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.black);
		frame.setSize(height, width);
		frame.add(textPanel);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		textPanel.setBackground(Color.black);
		frame.getContentPane().add(new StartGraphics());
	}
}
