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
	JPanel UserInterFace1;
	JPanel UserInterFace2;
	JPanel UserInterFace3;
	JPanel UserInterFace4;
	JPanel UserInterFace5;
	JButton driverButton;
	JButton riderButton;
	JButton createButton;
	JButton backButton;
	JButton nextButton;
	JButton nextButton2;
	JButton nextButton3;
	JButton nextButton4;
	JLabel UserName;
	JLabel tryAgain;
	JLabel tryAgain2;
	JLabel tryAgain3;
	JLabel tryAgain4;
	JLabel tryAgain5;
	JLabel tryAgain6;
	JLabel tryAgain7;
	JLabel Password;
	JLabel Email;
	JLabel FName;
	JLabel LName;
	JLabel Phone;
	JLabel userinterface;
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
	String givenUN;
	String givenPW;
	Driver currentDriver;
	Rider currentRider;
	
	private Database DB = new Database(); 

	
	static JFrame frame;
	
	MainLogin(){
		
		login1 = new JFrame("Login Choices");
		login1.setLayout(null);
		login1.setSize(500, 600);
		login1.setLocation(200, 100);
		
		MainLoginPage = new JPanel();		
		MainLoginPage2 = new JPanel();
		MainLoginPage3 = new JPanel();

		RiderLoginPage = new JPanel();		
		RiderLoginPage2 = new JPanel();
		RiderLoginPage3 = new JPanel();		

		DriverLoginPage = new JPanel();
		DriverLoginPage2 = new JPanel();
		DriverLoginPage3 = new JPanel();

		CreateUserPage = new JPanel();
		CreateUserPage2 = new JPanel();
		CreateUserPage3 = new JPanel();
		CreateUserPage4 = new JPanel();
		CreateUserPage5 = new JPanel();
		
		CreateUser2Page = new JPanel();		
		CreateUser2Page2 = new JPanel();
		CreateUser2Page3 = new JPanel();
		CreateUser2Page4 = new JPanel();
		CreateUser2Page5 = new JPanel();
		
		UserInterFace1 = new JPanel();
		UserInterFace2 = new JPanel();
		UserInterFace3 = new JPanel();
		UserInterFace4 = new JPanel();
		UserInterFace5 = new JPanel();

		driverButton = new JButton("Driver Login");
		driverButton.setSize(150, 50);
		driverButton.setLocation(10, 10);
		driverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createDriverLogin(false);
			}
		});

		riderButton = new JButton("Rider Login");
		riderButton.setSize(150, 50);
		riderButton.setLocation(10, 60);
		riderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRiderLogin(false);

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
				EM.setText("");
				FirstName.setText("");
				LastName.setText("");
				Pass.setText("");
				phonetext.setText("");
				UN.setText("");
				CreateUserPage.remove(tryAgain3);
				CreateUserPage2.remove(tryAgain4);
				CreateUserPage3.remove(tryAgain);
				CreateUserPage4.remove(tryAgain2);
				CreateUser2Page.remove(tryAgain5);
				CreateUser2Page.remove(tryAgain6);
				DriverLoginPage3.remove(tryAgain7);
				createMainLogin();
			}
		});
		
		nextButton = new JButton("Next");
		nextButton.setSize(150, 50);
		nextButton.setLocation(10, 150);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next1clicked();
			}
		});
		
		nextButton2 = new JButton("Next");
		nextButton2.setSize(150, 50);
		nextButton2.setLocation(10, 150);
		nextButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next2clicked();
			}
		});
		
		nextButton3 = new JButton("Next");
		nextButton3.setSize(150, 50);
		nextButton3.setLocation(10, 150);
		nextButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next3clicked();
			}
		});

		nextButton4 = new JButton("Next");
		nextButton4.setSize(150, 50);
		nextButton4.setLocation(10, 150);
		nextButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next4clicked();
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

		tryAgain = new JLabel("*The userName is taken or invalid. Please try again.");
		tryAgain.setSize(100, 50);
		tryAgain.setLocation(10, 110);
		
		tryAgain2 = new JLabel("*Please enter valid password. Enter Something!");
		tryAgain2.setSize(100, 50);
		tryAgain2.setLocation(10, 110);
		
		tryAgain3 = new JLabel("*Please Enter Something for first name!");
		tryAgain3.setSize(100, 50);
		tryAgain3.setLocation(10, 110);

		tryAgain4 = new JLabel("*Please Enter Something for Last name!");
		tryAgain4.setSize(100, 50);
		tryAgain4.setLocation(10, 110);

		tryAgain5 = new JLabel("*Please Enter Something for email!");
		tryAgain5.setSize(100, 50);
		tryAgain5.setLocation(10, 110);

		tryAgain6 = new JLabel("*Please Enter Something for phone!");
		tryAgain6.setSize(100, 50);
		tryAgain6.setLocation(10, 110);

		tryAgain7 = new JLabel("**Please Enter valid username and Password**");
		tryAgain7.setSize(100, 50);
		tryAgain7.setLocation(10, 110);
		
		userinterface = new JLabel("Userinterface Page");
		userinterface.setSize(100, 50);
		userinterface.setLocation(10, 110);

				
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
	
	private void createRiderLogin(boolean error){
		
		login1.setTitle("Rider Login");
		RiderLoginPage.add(UserName);
		RiderLoginPage.add(UN);
		RiderLoginPage2.add(Password);
		RiderLoginPage2.add(Pass);
		RiderLoginPage3.add(backButton);
		RiderLoginPage3.add(nextButton4);
		if(error){
			RiderLoginPage3.add(tryAgain7);
			}
		setToDefaults();
		RiderLoginPage.setVisible(true);
		RiderLoginPage2.setVisible(true);
		RiderLoginPage3.setVisible(true);
		login1.add(RiderLoginPage);
		login1.add(RiderLoginPage2);
		login1.add(RiderLoginPage3);

	}
	
	private void createDriverLogin(boolean error){
		
		login1.setTitle("Driver Login");
		DriverLoginPage.add(UserName);
		DriverLoginPage.add(UN);
		DriverLoginPage2.add(Password);
		DriverLoginPage2.add(Pass);
		DriverLoginPage3.add(backButton);
		DriverLoginPage3.add(nextButton3);
		if(error){
			DriverLoginPage3.add(tryAgain7);
			}
		
		setToDefaults();
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
		setToDefaults();
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
		setToDefaults();
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

	private void createCreateNewUserUNT(){

		login1.setTitle("Create New User");
		CreateUserPage.add(FName);
		CreateUserPage.add(FirstName);
		CreateUserPage.add(tryAgain3);
		CreateUserPage2.add(LName);
		CreateUserPage2.add(LastName);
		CreateUserPage2.add(tryAgain4);
		CreateUserPage3.add(UserName);
		CreateUserPage3.add(UN);
		CreateUserPage3.add(tryAgain);	
		CreateUserPage4.add(Password);
		CreateUserPage4.add(Pass);
		CreateUserPage4.add(tryAgain2);
		CreateUserPage5.add(backButton);
		CreateUserPage5.add(nextButton);
		setToDefaults();
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
	
	private void createCreateNewUserES(){
		
		login1.setTitle("Create New User");
		CreateUserPage.add(FName);
		CreateUserPage.add(FirstName);
		CreateUserPage2.add(LName);
		CreateUserPage2.add(LastName);
		CreateUserPage3.add(UserName);
		CreateUserPage3.add(UN);
		CreateUserPage3.add(tryAgain);	
		CreateUserPage4.add(Password);
		CreateUserPage4.add(Pass);
		CreateUserPage4.add(tryAgain2);
		CreateUserPage5.add(backButton);
		CreateUserPage5.add(nextButton);
		setToDefaults();
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
	
	private void next1clicked(){
		
		newFirstName = FirstName.getText();
		newLastName = LastName.getText();
		newUsername = UN.getText();
		newPassword = Pass.getText();
		if (newFirstName.isEmpty() || newLastName.isEmpty() || newUsername.isEmpty() || newPassword.isEmpty()){
			createCreateNewUserES();
		}
		if (DB.userNameNotTaken(newUsername)){
			createCreateNewUser2();
		}
		else{
			createCreateNewUserUNT();
		}	
	}

	private void next2clicked(){
		
		newEmail = EM.getText();
		newPhone = phonetext.getText();
		if (newEmail.isEmpty() || newPhone.isEmpty()){
			createCreateNewUser2ES();
		}
		else{
			DB.addUser(newUsername, newPassword, newEmail, newPhone, "driver");
			createUserInterFace();
		}	
	}
	
	public void next3clicked(){
		
		givenUN = UN.getText();
		givenPW = Pass.getText();
		if(DB.authentic(givenUN, givenPW, "driver")){
			currentDriver = DB.getDriver(givenUN);
			createUserInterFace();
		}
		else{
			createDriverLogin(true);
		}
		
		
	}
	
	
	public void next4clicked(){
		
		givenUN = UN.getText();
		givenPW = Pass.getText();
		if(DB.authentic(givenUN, givenPW, "rider")){
			currentRider = DB.getRider(givenUN);
			createUserInterFace();
		}
		else{
			createRiderLogin(true);
		}		
		
	}
	
	
	private void createCreateNewUser2ES(){
		
		login1.setTitle("Create New User Part 2");
		CreateUser2Page.add(Email);
		CreateUser2Page.add(EM);
		CreateUser2Page.add(tryAgain5);
		CreateUser2Page2.add(Phone);
		CreateUser2Page2.add(phonetext);
		CreateUser2Page.add(tryAgain6);
//		CreateUser2Page3.add(UserName);
//		CreateUser2Page3.add(UN);
//		CreateUser2Page4.add(Password);
//		CreateUser2Page4.add(Pass);
		CreateUser2Page5.add(backButton);
		CreateUser2Page5.add(nextButton2);
		setToDefaults();
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
		setToDefaults();
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
	
	public void createUserInterFace(){
		
		login1.setTitle("UserInterFace");

		
		
		setToDefaults();
		UserInterFace1.add(userinterface);
		login1.add(UserInterFace1);
		
		
		
	}
	
	public void setToDefaults(){
	
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

		MainLoginPage.setSize(500, 200);
		MainLoginPage.setLocation(0, 0);
		MainLoginPage2.setSize(500, 200);
		MainLoginPage2.setLocation(0, 200);
		MainLoginPage3.setSize(500, 200);
		MainLoginPage3.setLocation(0, 400);

		RiderLoginPage.setSize(500, 200);
		RiderLoginPage.setLocation(0, 0);		
		RiderLoginPage2.setSize(500, 200);
		RiderLoginPage2.setLocation(0, 200);
		RiderLoginPage3.setSize(500, 200);
		RiderLoginPage3.setLocation(0, 400);		

		DriverLoginPage.setSize(500, 200);
		DriverLoginPage.setLocation(0, 0);
		DriverLoginPage2.setSize(500, 200);
		DriverLoginPage2.setLocation(0, 200);
		DriverLoginPage3.setSize(500, 200);
		DriverLoginPage3.setLocation(0, 400);

		CreateUserPage.setSize(500, 100);
		CreateUserPage.setLocation(0, 0);		
		CreateUserPage2.setSize(500, 100);
		CreateUserPage2.setLocation(0, 100);		
		CreateUserPage3.setSize(500, 100);
		CreateUserPage3.setLocation(0, 200);		
		CreateUserPage4.setSize(500, 100);
		CreateUserPage4.setLocation(0, 300);		
		CreateUserPage5.setSize(500, 100);
		CreateUserPage5.setLocation(0, 400);
		
		CreateUser2Page.setSize(500, 100);
		CreateUser2Page.setLocation(0, 0);
		CreateUser2Page2.setSize(500, 100);
		CreateUser2Page2.setLocation(0, 100);		
		CreateUser2Page3.setSize(500, 100);
		CreateUser2Page3.setLocation(0, 200);
		CreateUser2Page4.setSize(500, 100);
		CreateUser2Page4.setLocation(0, 300);		
		CreateUser2Page5.setSize(500, 100);
		CreateUser2Page5.setLocation(0, 400);
		
		UserInterFace1.setSize(500, 100);
		UserInterFace1.setLocation(0, 0);
		UserInterFace2.setSize(500, 100);
		UserInterFace2.setLocation(0, 100);
		UserInterFace3.setSize(500, 100);
		UserInterFace3.setLocation(0, 200);
		UserInterFace4.setSize(500, 100);
		UserInterFace4.setLocation(0, 300);
		UserInterFace5.setSize(500, 100);
		UserInterFace5.setLocation(0, 400);
		

		
	}

}

