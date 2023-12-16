import java.util.Scanner;
public class InvertedFullPyramid {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows=sc.nextInt();
		for(int i=rows;i>=1;i--){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}
	}
}
