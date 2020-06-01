import java.util.Scanner;

public class FC18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int temp,rev=0;
		int z=x;
		while(x>0) {
			temp=x%10;
			rev=rev*10+temp;
			x/=10;
		}
		if(rev==z) {
			System.out.println(z+" is a palindrome");
		}
		else {
			System.out.println(z+" is not a palindrome");
		}
		s.close();
	}
}
