import java.util.Scanner;

public class FC1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x>0) {
			System.out.println("Positive");
		}
		else if(x==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
		s.close();
	}
}
