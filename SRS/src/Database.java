
public class Database {
	private String[] userDatabase;
	private Driver[] userDatabase2;
	private int currentUserNum = 1;
	private int lookup = -1;
	private Driver newDriverUser;
	private Rider newRiderUser;
	
	public void addUser(String Username, String phone, String Password, String email, String phonenum, String type){
		
		userDatabase[currentUserNum] = Username;
		Profile pf = new Profile();
		if(type == "driver"){
			newDriverUser = new Driver(Username, Password, email, phonenum, pf);
			userDatabase2[currentUserNum] = newDriverUser;

		}
		else if(type == "rider"){
			newRiderUser = new Rider(Username, Password, email, phonenum, pf);
			userDatabase2[currentUserNum] = newDriverUser;

		}
		else{
			System.out.println("there is a problem: wrong type in database class, addUser");
		}

		currentUserNum ++;
		
	}
	
	public boolean authentic(String userName, String Password){
		for (int i=0; i < userDatabase.length; i++) {
		    if(userDatabase[i] == userName){
		    	lookup = i;
		    	break;
		    }    	
		}
		boolean returnstr = userDatabase2[lookup].checkPassword(Password);
		lookup = -1;
		return returnstr;
	}

}
