package Maps;

import java.util.ArrayList;

import Profile.User;


public class MapsController<E> {
	
	ArrayList<User> _users = new ArrayList<User>();
	
	public void setMap(){

		for (User u : _users){
			int y = convertLat(u.getLat());
			int x = convertLat(u.getLon());
			
		}
	}
	
	public int convertLat(double lat){
		return 0;
		
	}

	public int convertLon(double lon){
		return 0;
		
	}
}
