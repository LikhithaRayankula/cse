import java.util.Scanner;
public class SumAndAverage {

	public static void main(String[] args) {
		int[] numbers= {5,10,15,20,25,30};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum+=numbers[i];
		}
		double average = (double)sum/numbers.length;
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+average);
	}
}
