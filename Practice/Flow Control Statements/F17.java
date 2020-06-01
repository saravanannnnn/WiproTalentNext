import java.util.Scanner;

public class FC17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int temp,rev=0;
		while(x>0) {
			temp=x%10;
			rev=rev*10+temp;
			x/=10;
		}
		System.out.println(rev);
		s.close();
	}

}
