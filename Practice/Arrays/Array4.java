import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char[] c=new char[n];
		for(int i=0;i<n;i++) {
			c[i]=(char)s.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(c[i]);
		}
		s.close();
	}
}
