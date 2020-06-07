import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int count=0,x=a[0];
		for(int i=0;i<n;i++) {
			int temp=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					temp++;
				}
			}
			if(temp>count) {
				count=temp;
				x=a[i];
			}
		}
		System.out.print(x);
		s.close();
	}
}
