import java.util.Scanner;
public class HollowFullPyramid {
	public static void main(String args[]){
		int i,n,j;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		n = input.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				if(j==1||j==i||i==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");	
				}
			}
		System.out.println();
		}
	}
}
