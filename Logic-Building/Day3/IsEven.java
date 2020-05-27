import java.util.Scanner;

public class IsEven {
	
	static int Even(int x) {
		if(x%2==0) {
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
		x=Even(a);
		if(x==2) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		s.close();
	}
}
