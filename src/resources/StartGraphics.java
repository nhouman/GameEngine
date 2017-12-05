package resources;

//Found from Java2s, modified for our purposes

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//Implement a tick-based system that updates the entire screen, then paints it when available
public class StartGraphics extends JPanel {

	static int length = 640;//X value of window
	static int width = 480;//Y value of window
	static Map map1 = new Map(20,20);
	public void paint(Graphics g) {
		//Dimension d = this.getPreferredSize();
		int fontSize = 15;
		int temp1 = 0, temp2 = 0;
		int tempLength = length / 30, tempWidth = width/30;

		g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
		g.setColor(Color.white);
		
		map1.addEvent(0,0,0,0,"^");
		for (int i = 0; i < length - 20; i += 25)//Change length and  width values so the printed values don't go out of the window
		{
			for (int n = 0; n < width - 30; n+= 25)
			{
				g.drawString(map1.getMap(temp1, temp2), i, n);
				if (temp2 >= 19) {

					temp2 = 0;
				} else
					temp2++;
			}
			if (temp1 >= 19) {

				temp1 = 0;
			} else
				temp1++;
		}
	}


	public static void main(String[] args) throws Exception {
		double time_passed = 0, delta_time = 0;
		try {
			JFrame frame = new JFrame("FireFly");
			//Image a = ImageIO.read(new File("\\graphics\\icon.png\\"));//Cannot read for some reason
			//frame.setIconImage(a);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(length, width);
			frame.setVisible(true);
			frame.getContentPane().setBackground( Color.black );
			frame.getContentPane().add(new StartGraphics());
			frame.getContentPane().setBackground( Color.black );
		} catch (Exception e) {
			writeError(e);
		}
	}

	static void writeError(Exception e) throws IOException {
		DateFormat df = new SimpleDateFormat("MM-dd-yy HHmmss");
		Date today = Calendar.getInstance().getTime();
		BufferedWriter bw = new BufferedWriter(new FileWriter("ErrorLog: " + df.format(today) + ".txt"));
		System.out.println("Error: " + e + " - Writing to ErrorLog: " + df.format(today) + ".txt");
		bw.write(e.toString());
	}
}