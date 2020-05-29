import java.util.Scanner;

public class FC2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		if(x%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		s.close();
	}
}
