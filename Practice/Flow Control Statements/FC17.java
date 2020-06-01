import java.util.Scanner;

public class FC17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder rev=new StringBuilder();
		int x=s.nextInt();
		int temp;
		while(x>0) {
			temp=x%10;
			rev.append(temp);
			x/=10;
		}
		System.out.println(rev);
		s.close();
	}
}
