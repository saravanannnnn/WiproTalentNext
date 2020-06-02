import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int min,max;
		int[] arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=s.nextInt();
		}
		min=arr[0];
		max=arr[0];
		for(int i=0;i<x;i++) {
			if(min<arr[i]) {
				min=arr[i];
			}
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		s.close();
	}
}
