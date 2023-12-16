
public class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		super("User outside India cannot registered");
	}
	public InvalidCountryException(String message) {
		super(message);
	}
}
