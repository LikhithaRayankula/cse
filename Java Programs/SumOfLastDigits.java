import java.util.Scanner;
public class SumOfLastDigits {
public static int addLastDigits (int a,int b) {
	if(a<0)
		a=a*(-1);
	if(b<0)
		b=b*(-1);
	return a%10+b%10;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
        System.out.println("Enter two no :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum is : "+addLastDigits(a,b));
	}
}
