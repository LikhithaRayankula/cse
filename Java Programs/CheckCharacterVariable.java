import java.util.Scanner;
public class CheckCharacterVariable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=1;
		char b=c;
		System.out.println("Enter any character : ");
		String str1=sc.nextLine();
		if(str1==b)
			System.out.println(str1+" is Alphabet");
		else if(str1==a)
			System.out.println(str1+" is Digit");
		else
			System.out.println(str1+" is Special character");

	}

}
