import java.util.Scanner;

public class FC12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x==0 || x==1) {
			System.out.print("Not a prime number");
			return;
		}
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0) {
				System.out.print("Not a prime number");
				return;
			}
			System.out.println("Prime number");
		}
	}
}
