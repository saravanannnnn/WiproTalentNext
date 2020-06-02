import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=s.nextInt();
		}
		int y=s.nextInt();
		int out=-1;
		for(int i=0;i<x;i++) {
			if(arr[i]==y) {
				out=i+1;
				break;
			}
		}
		System.out.println(out);
		s.close();
	}
}
