
public class CopyString {

	public static void main(String[] args) {
		String input ="srit";
		int length=input.length();
		String FirstTwoChars = input.substring(0,2);
		String output = " ";
		for(int i=0;i<length;i++)
			output += FirstTwoChars;
		System.out.println("Output : "+output);
	
	
	}

}
