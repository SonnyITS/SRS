import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

///Testing Dima git 1 

public class Profile {
	private String picture;
	private String rating;
	private String name;
	private String phone;
	private String hours;
	private String rate;
	private String bio;
	private String reviews;
	JButton button;
	JLabel label;
	String s;
	
	Profile(){}
	
	public void showProfile(JFrame page){
		
		page.setTitle("Upload/Update Picture");
		button = new JButton("Upload");
		button.setBounds(350, 0, 100, 40);
	 
	 label = new JLabel();
	 label.setBounds(10,10,300,550);
	 button.addActionListener(new ActionListener(){
	        @Override
	     public void actionPerformed(ActionEvent e){
	         JFileChooser fileChooser = new JFileChooser();
	         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
	         fileChooser.addChoosableFileFilter(filter);
	         int result = fileChooser.showSaveDialog(null);
	         if(result == JFileChooser.APPROVE_OPTION){
	             File selectedFile = fileChooser.getSelectedFile();
	             String path = selectedFile.getAbsolutePath();
	             label.setIcon(ResizeImage(path));
	             s = path;
	              }
	         else if(result == JFileChooser.CANCEL_OPTION){
	             //System.out.println("No Data");
	         }
	     }
	    });
	 	page.setLayout(null);
	    page.add(label);
	    page.add(button);
	    page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    page.setSize(500,600);
	    page.setVisible(true);
	
	}
	 public ImageIcon ResizeImage(String imgPath){
	        ImageIcon MyImage = new ImageIcon(imgPath);
	        Image img = MyImage.getImage();
	        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
	        ImageIcon image = new ImageIcon(newImage);
	        return image;
	    }
	
	public void updatePicture(){
	
	}
	public void updateRating(){
		
    }
	public void updateHours(String h){
		this.hours = h;
	}
	public void updateName(String N){
		this.name = N;
	}
	public void updatePhone(String P){
		this.name = P;
	}
	
	public void updateRate(String R){
		this.rate = R;
	}
	public void updateBio(){
		//code needed
	}
	public void updateReviews(){
		//code needed
	}
}
