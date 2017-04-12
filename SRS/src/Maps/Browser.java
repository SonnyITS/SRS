package Maps;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

class Browser extends Region {
	
	private static double _origLat = 0;
	private static double _origLon = 0;
	
	private static double _destLat = 0;
	private static double _destLon = 0;
 
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
     
    public Browser() {
        //apply the styles
        getStyleClass().add("browser");
        
        // load the web page
        webEngine.load("http://www.google.com/maps/place/" + _origLat + "," + _origLon);
        ///webEngine.load("http://maps.google.com");
        ///webEngine.load("https://www.google.com/maps/dir/" + _origLat + "," + _origLon + "/" + _destLat + "," + _destLon + "/");
        
        
        //add the web view to the scene
        getChildren().add(browser);
 
    }
    private Node createSpacer() {
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        return spacer;
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
    
    public static void setLat(double lat){
    	_origLat = lat;
    }
    
    public static void setLon(double lon){
    	_origLon = lon;
    }
    
}