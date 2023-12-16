
public class FirstHalfOfString {

	public static void main(String[] args) {
		String input ="colleges";
		String output = getFirstHalf(input);
		System.out.println("Output : "+output);

	}

	private static String getFirstHalf(String input) {
		if(input.length()%2==0) {
			int halfLength = input.length()/2;
			return input.substring(0,halfLength);
		}
		else {
		return null;
		}

	}

}
