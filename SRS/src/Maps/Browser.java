package Maps;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

@SuppressWarnings("restriction")
class Browser extends Region {
	
	private static double _origLat = 0;
	private static double _origLon = 0;
	
	private static double _destLat = 0;
	private static double _destLon = 0;
	
	private static int _choice = 0;
 
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
    
    
     
    public Browser() {
        //apply the styles
        getStyleClass().add("browser");
        
		// loads the page
		switch (_choice) {
		case 1:
			webEngine.load("http://www.google.com/maps/place/" + _origLat + "," + _origLon);
			break;

		case 2:
			webEngine.load("https://www.google.com/maps/dir/" + _origLat + "," + _origLon + "/" + _destLat + ","
					+ _destLon + "/");
			break;

		case 3:
			webEngine.load("https://maps.google.com");
			break;
		}

        //add the web view to the scene
        getChildren().add(browser);
 
    }
    
 
    @Override protected void layoutChildren() {
        double w = getWidth();
        double h = getHeight();
        layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);
    }
 
    @Override protected double computePrefWidth(double height) {
        return 750;
    }
 
    @Override protected double computePrefHeight(double width) {
        return 500;
    }
    
    public static void setOrigLat(double lat){
    	_origLat = lat;
    }
    
    public static void setOrigLon(double lon){
    	_origLon = lon;
    }
    
    public static void setDestLat(double lat){
    	_destLat = lat;
    }
    
    public static void setDestLon(double lon){
    	_destLon = lon;
    }
    
    public static void setChoice(int x){
    	_choice = x;
    }
    
}