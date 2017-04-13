package Maps;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



 
 
@SuppressWarnings("restriction")
public class Navigation extends Application {
	
	static Scanner kbd = new Scanner(System.in);
	
	
    private Scene scene;
    @Override public void start(Stage stage) {
        // create the scene
        stage.setTitle("Maps");
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setScene(scene);
        ///scene.getStylesheets().add("webviewsample/BrowserToolbar.css");        
        stage.show();
        
        ///System.out.println(_lat);
        ///System.out.println(_lon);
    }
    
    public static void main(){
    	
    	double origLat = kbd.nextDouble();
    	double origLon = kbd.nextDouble();
    	
    	Browser.setOrigLat(origLat);
    	Browser.setOrigLon(origLon);
    	
    	Browser.setChoice(1);
    	
        launch();
    }
    
    public static void main(double destLat , double destLon){
    	
    	double origLat = kbd.nextDouble();
    	double origLon = kbd.nextDouble();
    	///double destLat = kbd.nextDouble();
    	///double destLon = kbd.nextDouble();
    	
    	Browser.setOrigLat(origLat);
    	Browser.setOrigLon(origLon);
    	Browser.setDestLat(destLat);
    	Browser.setDestLon(destLon);
    	
    	Browser.setChoice(2);
    	
        launch();
    }
 
    
}

