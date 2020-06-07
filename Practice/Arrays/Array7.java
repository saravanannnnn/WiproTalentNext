import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int index=0;
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int t=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					t=1;
				}
			}
			if(t==0) {
				b[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<index;i++) {
			System.out.println(b[i]);
		}
		s.close();
	}
}
