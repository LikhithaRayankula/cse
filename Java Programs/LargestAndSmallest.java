import java.util.Scanner;
public class LargestAndSmallest {

	public static void main(String[] args) {
		int a;
		int arr[]= {55,10,8,90,43,57,25,92,30,16};
		int count=arr.length;
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arr[i]>arr[j]) {
					a= arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.println("Smallest : "+arr[0]);
		System.out.println("Largest : "+arr[count-1]);
		System.out.println("Second Smallest : "+arr[1]);
		System.out.println("Second Largest : "+arr[count-2]);

	}

}
