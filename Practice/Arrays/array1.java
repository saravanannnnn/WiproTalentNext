import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int sum=0;
		float avg;
		int[] arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		avg=sum/x;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		s.close();
	}
}
