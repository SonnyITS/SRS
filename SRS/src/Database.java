
public class Database {
	private String usernameDDatabase[] = new String[100];
	private String usernameRDatabase[] = new String[100];
	private Driver driverDatabase[] = new Driver[100];
	private Rider riderDatabase[] = new Rider[100];
	private int currentUserNum = 2;
	private int numofDriver = 1;
	private int numofRider = 1;
	private int lookup = -1;
	private Driver newDriverUser;
	private Rider newRiderUser;
	
	Database(){

		for (int i=0; i < usernameDDatabase.length; i++) {
			usernameDDatabase[i] = "";
		    }
		for (int i=0; i < usernameRDatabase.length; i++) {
			usernameRDatabase[i] = "";
		    }    	
		
		usernameDDatabase[0] = "awesome";
		Profile pf = new Profile();
		newDriverUser = new Driver("awesome", "awesome", "awesome@gmail.com", "111-111-1111", pf);
		driverDatabase[0] = newDriverUser;
		
		usernameRDatabase[0] = "amazing";
		Profile pf2 = new Profile();
		newRiderUser = new Rider("amazing", "amazing", "amazing@gmail.com", "222-222-2222", pf2);
		riderDatabase[0] = newRiderUser;
		
		
		
	}
	public void addUser(String Username, String Password, String email, String phonenum, String type){
		
		
		Profile pf = new Profile();
		if(type == "driver"){
			newDriverUser = new Driver(Username, Password, email, phonenum, pf);
			driverDatabase[numofDriver] = newDriverUser;
			usernameDDatabase[numofDriver] = Username;
			numofDriver ++;
			

		}
		else if(type == "rider"){
			newRiderUser = new Rider(Username, Password, email, phonenum, pf);
			riderDatabase[numofRider] = newRiderUser;
			usernameRDatabase[numofDriver] = Username;
			numofRider ++;
		}
		else{
			System.out.println("there is a problem: wrong type in database class, addUser");
		}

		currentUserNum ++;
		
	}
	
	public Driver getDriver(String username){
		int rtn = 0;
		for (int i=0; i < numofDriver; i++) {
		    if(usernameDDatabase[i].equals(username)){
		    	rtn = i;
		    	break;
		    }
		}
		return driverDatabase[rtn];
		
	}
	
	public Rider getRider(String username){
		int rtn = 0;
		for (int i=0; i < numofDriver; i++) {
		    if(usernameDDatabase[i].equals(username)){
		    	rtn = i;
		    	break;
		    }
		}
		return riderDatabase[rtn];
	}
	
	public boolean userNameNotTaken(String username){
		for (int i=0; i < usernameDDatabase.length; i++) {
		    if(usernameDDatabase[i].equals(username)){
		    	return false;
		    }    	
		}
		for (int i=0; i < usernameRDatabase.length; i++) {
		    if(usernameRDatabase[i].equals(username)){
		    	return false;
		    }    	
		}
		return true;
	}
	
	public boolean authenticDriver(String userName, String Password){
		boolean returnstr;
		for (int i=0; i < usernameDDatabase.length; i++) {
			if(usernameDDatabase[i].equals(userName)){
				lookup = i;
				break;
			}    	
		}
		returnstr = driverDatabase[lookup].checkPassword(Password);
		return returnstr;			
	}
	
	
	public boolean authenticRider(String userName, String Password){
		boolean returnstr;
		for (int i=0; i < usernameRDatabase.length; i++) {
			if(usernameRDatabase[i].equals(userName)){
				lookup = i;
				break;
				}    	
			}
		returnstr = riderDatabase[lookup].checkPassword(Password);			
		lookup = -1;
		return returnstr;
	}

}
