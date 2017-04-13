package Maps;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Map {
	
	static Scanner kbd = new Scanner(System.in);
	
	static double latitude;
	static double longitude;
	
	public static void map() throws IOException {
		JFrame test = new JFrame("Google Maps");
		
		try {
			latitude = kbd.nextDouble();
			longitude = kbd.nextDouble();
			int zoom = 13;
			
			String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center=" + latitude + "," + longitude
					+ "&zoom=" + zoom + "&size=612x612&scale=2&maptype=roadmap";
			
			String destinationFile = "image.jpg";
			// read the map image from Google
			// then save it to a local file: image.jpg
			//
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(destinationFile);
			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		
////////////////////////////////////////////////////////
		///Have Maps controller hold the users refrences in arraylist
		///Then use enhanced for loop to make jbuttons visible on map
		JButton b1 = new JButton();
		b1.setBorder(new RoundedBorder(10));
		b1.setLocation(0, 0);
		///b1.setVisible(true);
		
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 612, 612);
		///p1.setVisible(true);
		p1.setOpaque(false);
		
		test.add(p1);
		p1.add(b1);
		b1.setVisible(true);
//////////////////////////////////////////////////////		
		
		// create a GUI component that loads the image: image.jpg
		//
		ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg")).getImage().getScaledInstance(630, 600, java.awt.Image.SCALE_SMOOTH));
		test.add(new JLabel(imageIcon));
		// show the GUI window
		test.setVisible(true);
		test.pack();
		
		
	}
}