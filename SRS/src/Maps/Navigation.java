package Maps;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;



 
 
public class Navigation extends Application {
	
	private static double _lat;
	private static double _lon;
	
	
    private Scene scene;
    @Override public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setScene(scene);
        ///scene.getStylesheets().add("webviewsample/BrowserToolbar.css");        
        stage.show();
        
        ///System.out.println(_lat);
        ///System.out.println(_lon);
    }
    
    public static void main(String[] args , double lat , double lon){
    	
    	Browser.setLat(lat);
    	Browser.setLon(lon);
    	
        launch(args);
    }
    
    public static void main(String[] args){
    	
        launch(args);
    }
 
    
}

