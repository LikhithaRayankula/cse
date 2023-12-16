import java.util.Scanner;
public class PerfectOrNot {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc= new Scanner( System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("Given number is perfect number");
		}
		else {
			System.out.println("Given number is not a perfect number");
		}

	}
int divisor(int x) {
	return x;
}
}
