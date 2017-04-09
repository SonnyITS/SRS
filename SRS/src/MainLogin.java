import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class MainLogin {
	
	JFrame login1;
	JButton driverButton;
	JButton riderButton;
	JButton createButton;
	
	static JFrame frame;
	
	MainLogin(){
		
		login1 = new JFrame("Login page");
		login1.setLayout(null);
		login1.setSize(500, 600);
		login1.setLocation(200, 100);

		driverButton = new JButton("Driver Login");
		driverButton.setSize(150, 50);
		driverButton.setLocation(10, 10);
		driverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///System.out.println("test");
				///NEXT FRAME.setVisible(true);
				login1.setVisible(false);
			}
		});

		riderButton = new JButton("Rider Login");
		riderButton.setSize(150, 50);
		riderButton.setLocation(10, 60);
		riderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display/center the jdialog when the button is pressed
				JDialog d = new JDialog(frame, "Hello", true);
				d.setLocationRelativeTo(frame);
				d.setVisible(true);
			}
		});

		createButton = new JButton("Create New User");
		createButton.setSize(150, 50);
		createButton.setLocation(10, 110);
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display/center the jdialog when the button is pressed
				JDialog d = new JDialog(frame, "Hello", true);
				d.setLocationRelativeTo(frame);
				d.setVisible(true);
			}
		});
		
		this.create();
		
	}
	
	
	private void create(){
	login1.add(driverButton);
	login1.add(riderButton);
	login1.add(createButton);
	login1.show();
	}

}
