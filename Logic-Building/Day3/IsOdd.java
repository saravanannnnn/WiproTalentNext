import java.util.Scanner;

public class IsOdd {
	
	static int Odd(int x) {
		if(x%2!=0) {
			return 2;
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		int a,x;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		x=Odd(a);
		if(x==2) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		s.close();
	}
}
