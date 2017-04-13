package Profile;

public class User 
{

	protected String userName;
	protected String email;
	protected String phone;
	protected String password;
	Profile profile;

	User(String uN, String pw, String em, String p, Profile pf) {
		userName = uN;
		email = em;
		phone = p;
		password = pw;
		profile = pf;
	}

	public String getContactInfo(String t) {

		if (t.equals("e")) {
			return email;
		} else if (t.equals("p")) {
			return phone;
		} else {
			return "error: Wrong Type of contact info requested";
		}

	}
	

	public boolean checkPassword(String pass){
		if (pass.equals(password)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Profile getProfile(){
		return profile;
	}

	public double getLat() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getLon() {
		// TODO Auto-generated method stub
		return 0;
	}

}
