import javax.swing.*;

///Testing Ashim git 1

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLogin {
	JFrame login1;
	JPanel MainLoginPage;
	JPanel MainLoginPage2;
	JPanel MainLoginPage3;
	JPanel DriverLoginPage;
	JPanel DriverLoginPage2;
	JPanel DriverLoginPage3;
	JPanel RiderLoginPage;
	JPanel RiderLoginPage2;
	JPanel RiderLoginPage3;
	JPanel CreateUserPage;
	JPanel CreateUserPage2;
	JPanel CreateUserPage3;
	JPanel CreateUserPage4;
	JPanel CreateUserPage5;
	JPanel CreateUser2Page;
	JPanel CreateUser2Page2;
	JPanel CreateUser2Page3;
	JPanel CreateUser2Page4;
	JPanel CreateUser2Page5;	
	JButton driverButton;
	JButton riderButton;
	JButton createButton;
	JButton backButton;
	JButton nextButton;
	JButton nextButton2;
	JLabel UserName;
	JLabel Password;
	JLabel Email;
	JLabel FName;
	JLabel LName;
	JLabel Phone;
	JTextField UN;
	JTextField EM;
	JTextField FirstName;
	JTextField LastName;	
	JTextField phonetext;
	JPasswordField Pass;
	String newUsername;
	String newPassword;
	String newFirstName;
	String newLastName;
	String newEmail;
	String newPhone;

	
	static JFrame frame;
	
	MainLogin(){
		
		login1 = new JFrame("Login Choices");
		login1.setLayout(null);
		login1.setSize(500, 600);
		login1.setLocation(200, 100);
		
		MainLoginPage = new JPanel();
		MainLoginPage.setSize(500, 200);
		MainLoginPage.setLocation(0, 0);
		
		MainLoginPage2 = new JPanel();
		MainLoginPage2.setSize(500, 200);
		MainLoginPage2.setLocation(0, 200);

		MainLoginPage3 = new JPanel();
		MainLoginPage3.setSize(500, 200);
		MainLoginPage3.setLocation(0, 400);

		RiderLoginPage = new JPanel();
		RiderLoginPage.setSize(500, 200);
		RiderLoginPage.setLocation(0, 0);
		
		RiderLoginPage2 = new JPanel();
		RiderLoginPage2.setSize(500, 200);
		RiderLoginPage2.setLocation(0, 200);

		RiderLoginPage3 = new JPanel();
		RiderLoginPage3.setSize(500, 200);
		RiderLoginPage3.setLocation(0, 400);
		
		DriverLoginPage = new JPanel();
		DriverLoginPage.setSize(500, 200);
		DriverLoginPage.setLocation(0, 0);

		DriverLoginPage2 = new JPanel();
		DriverLoginPage2.setSize(500, 200);
		DriverLoginPage2.setLocation(0, 200);

		DriverLoginPage3 = new JPanel();
		DriverLoginPage3.setSize(500, 200);
		DriverLoginPage3.setLocation(0, 400);

		CreateUserPage = new JPanel();
		CreateUserPage.setSize(500, 100);
		CreateUserPage.setLocation(0, 0);
		
		CreateUserPage2 = new JPanel();
		CreateUserPage2.setSize(500, 100);
		CreateUserPage2.setLocation(0, 100);
		
		CreateUserPage3 = new JPanel();
		CreateUserPage3.setSize(500, 100);
		CreateUserPage3.setLocation(0, 200);

		CreateUserPage4 = new JPanel();
		CreateUserPage4.setSize(500, 100);
		CreateUserPage4.setLocation(0, 300);
		
		CreateUserPage5 = new JPanel();
		CreateUserPage5.setSize(500, 100);
		CreateUserPage5.setLocation(0, 400);

		CreateUser2Page = new JPanel();
		CreateUser2Page.setSize(500, 100);
		CreateUser2Page.setLocation(0, 0);
		
		CreateUser2Page2 = new JPanel();
		CreateUser2Page2.setSize(500, 100);
		CreateUser2Page2.setLocation(0, 100);
		
		CreateUser2Page3 = new JPanel();
		CreateUser2Page3.setSize(500, 100);
		CreateUser2Page3.setLocation(0, 200);

		CreateUser2Page4 = new JPanel();
		CreateUser2Page4.setSize(500, 100);
		CreateUser2Page4.setLocation(0, 300);
		
		CreateUser2Page5 = new JPanel();
		CreateUser2Page5.setSize(500, 100);
		CreateUser2Page5.setLocation(0, 400);
		
		driverButton = new JButton("Driver Login");
		driverButton.setSize(150, 50);
		driverButton.setLocation(10, 10);
		driverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createDriverLogin();
			}
		});

		riderButton = new JButton("Rider Login");
		riderButton.setSize(150, 50);
		riderButton.setLocation(10, 60);
		riderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRiderLogin();

			}
		});

		createButton = new JButton("Create New User");
		createButton.setSize(150, 50);
		createButton.setLocation(10, 110);
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createCreateNewUser();
			}
		});
		

		backButton = new JButton("Back to Login Choices");
		backButton.setSize(150, 50);
		backButton.setLocation(10, 50);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createMainLogin();
			}
		});
		
		nextButton = new JButton("Next");
		nextButton.setSize(150, 50);
		nextButton.setLocation(10, 150);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printwhatisgiven();
				createCreateNewUser2();
			}
		});
		
		nextButton2 = new JButton("Next");
		nextButton2.setSize(150, 50);
		nextButton2.setLocation(10, 150);
		nextButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createDriverLogin();
			}
		});
		
		UserName = new JLabel("UserName");
		UserName.setSize(150, 50);
		UserName.setLocation(10, 10);

		Password = new JLabel("Password");
		Password.setSize(150, 50);
		Password.setLocation(10, 60);

		Email = new JLabel("Email");
		Email.setSize(100, 50);
		Email.setLocation(10, 110);
		
		FName = new JLabel("First Name");
		FName.setSize(100, 50);
		FName.setLocation(10, 110);
	
		LName = new JLabel("Last Name");
		LName.setSize(100, 50);
		LName.setLocation(10, 110);

		Phone = new JLabel("Phone Number");
		Phone.setSize(100, 50);
		Phone.setLocation(10, 110);

		UN = new JTextField(20);
		UN.setSize(150, 50);
		UN.setLocation(100, 10);

		EM = new JTextField(20);
		EM.setSize(150, 50);
		EM.setLocation(100, 10);
		
		Pass = new JPasswordField(20);
		Pass.setSize(150, 50);
		Pass.setLocation(100, 60);
		
		FirstName = new JTextField(20);
		FirstName.setSize(150, 50);
		FirstName.setLocation(100, 10);

		LastName = new JTextField(20);
		LastName.setSize(150, 50);
		LastName.setLocation(100, 10);

		phonetext = new JTextField(10);
		phonetext.setSize(150, 50);
		phonetext.setLocation(100, 10);

		
		this.createMainLogin();
		
	}
	
	private void createRiderLogin(){
		
		login1.setTitle("Rider Login");
		RiderLoginPage.add(UserName);
		RiderLoginPage.add(UN);
		RiderLoginPage2.add(Password);
		RiderLoginPage2.add(Pass);
		RiderLoginPage3.add(backButton);
		setAllInvisible();
		RiderLoginPage.setVisible(true);
		RiderLoginPage2.setVisible(true);
		RiderLoginPage3.setVisible(true);
		login1.add(RiderLoginPage);
		login1.add(RiderLoginPage2);
		login1.add(RiderLoginPage3);

	}
	
	private void createDriverLogin(){
		
		login1.setTitle("Driver Login");
		DriverLoginPage.add(UserName);
		DriverLoginPage.add(UN);
		DriverLoginPage2.add(Password);
		DriverLoginPage2.add(Pass);
		DriverLoginPage3.add(backButton);
		setAllInvisible();
		DriverLoginPage.setVisible(true);
		DriverLoginPage2.setVisible(true);
		DriverLoginPage3.setVisible(true);
		login1.add(DriverLoginPage);
		login1.add(DriverLoginPage2);
		login1.add(DriverLoginPage3);

	}

	
	private void createMainLogin(){
		
		login1.setTitle("Login Choices");
		MainLoginPage.add(driverButton);
		MainLoginPage2.add(riderButton);
		MainLoginPage3.add(createButton);
		setAllInvisible();
		MainLoginPage.setVisible(true);
		MainLoginPage2.setVisible(true);
		MainLoginPage3.setVisible(true);
		login1.add(MainLoginPage);
		login1.add(MainLoginPage2);
		login1.add(MainLoginPage3);
		login1.show();
	}
	
	private void createCreateNewUser(){
		
		login1.setTitle("Create New User");
		CreateUserPage.add(FName);
		CreateUserPage.add(FirstName);
		CreateUserPage2.add(LName);
		CreateUserPage2.add(LastName);
		CreateUserPage3.add(UserName);
		CreateUserPage3.add(UN);
		CreateUserPage4.add(Password);
		CreateUserPage4.add(Pass);
		CreateUserPage5.add(backButton);
		CreateUserPage5.add(nextButton);
		setAllInvisible();
		CreateUserPage.setVisible(true);
		CreateUserPage2.setVisible(true);
		CreateUserPage3.setVisible(true);
		CreateUserPage4.setVisible(true);
		CreateUserPage5.setVisible(true);
		login1.add(CreateUserPage);
		login1.add(CreateUserPage2);
		login1.add(CreateUserPage3);
		login1.add(CreateUserPage4);
		login1.add(CreateUserPage5);
		

		
	}
	
	private void printwhatisgiven(){
		
		newFirstName = FirstName.getText();
		newLastName = LastName.getText();
		newUsername = UN.getText();
		newPassword = Pass.getText();
		System.out.println(newFirstName);
		System.out.println(newLastName);
		
	}
	
	private void createCreateNewUser2(){
		
		login1.setTitle("Create New User Part 2");
		CreateUser2Page.add(Email);
		CreateUser2Page.add(EM);
		CreateUser2Page2.add(Phone);
		CreateUser2Page2.add(phonetext);
//		CreateUser2Page3.add(UserName);
//		CreateUser2Page3.add(UN);
//		CreateUser2Page4.add(Password);
//		CreateUser2Page4.add(Pass);
		CreateUser2Page5.add(backButton);
		CreateUser2Page5.add(nextButton2);
		setAllInvisible();
		CreateUser2Page.setVisible(true);
		CreateUser2Page2.setVisible(true);
		CreateUser2Page3.setVisible(true);
		CreateUser2Page4.setVisible(true);
		CreateUser2Page5.setVisible(true);
		login1.add(CreateUser2Page);
		login1.add(CreateUser2Page2);
		login1.add(CreateUser2Page3);
		login1.add(CreateUser2Page4);
		login1.add(CreateUser2Page5);
		
		
	}

	
	
	public void setAllInvisible(){
	
		MainLoginPage.setVisible(false);
		MainLoginPage2.setVisible(false);
		MainLoginPage3.setVisible(false);
		RiderLoginPage.setVisible(false);
		RiderLoginPage2.setVisible(false);
		RiderLoginPage3.setVisible(false);
		DriverLoginPage.setVisible(false);
		DriverLoginPage2.setVisible(false);
		DriverLoginPage3.setVisible(false);
		CreateUserPage.setVisible(false);
		CreateUserPage2.setVisible(false);
		CreateUserPage3.setVisible(false);
		CreateUserPage4.setVisible(false);
		CreateUserPage5.setVisible(false);
		CreateUser2Page.setVisible(false);
		CreateUser2Page2.setVisible(false);
		CreateUser2Page3.setVisible(false);
		CreateUser2Page4.setVisible(false);
		CreateUser2Page5.setVisible(false);

	}

}

