import java.util.Scanner;
public class SortOrder {

	public static void main(String[] args) {
		int[] arr = new int[] {7,4,8,5,3};
		int temp=0;
		System.out.println("Elements in original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements in sorted order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
