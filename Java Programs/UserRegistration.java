public class UserRegistration {
	public void registerUser(String userName,String userCountry) {
		try {
			if(!userCountry.equals( "India")) {
				throw new InvalidCountryException();
			}
			else {
				System.out.println("User registration done successfully");
			}
		}
		catch(InvalidCountryException e) {
			System.err.println("error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		UserRegistration reg = new UserRegistration();
		reg.registerUser( "Ram", "India");
		reg.registerUser( "John", "USA");
	}
}
