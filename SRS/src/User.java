
public class User 
{

	protected String userName;
	protected String email;
	protected String phone;
	Profile profile;

	User(String uN, String em, String p, Profile pf) {
		userName = uN;
		email = em;
		phone = p;

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

}
