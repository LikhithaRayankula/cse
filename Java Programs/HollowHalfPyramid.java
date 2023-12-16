import java.util.Scanner;
public class HollowHalfPyramid {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				if((j==n)||(i==j)||(i==1)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}
