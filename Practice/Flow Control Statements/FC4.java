import java.util.Scanner;

public class FC4 {

	public static void main(String[] args) {
		char a,b;
		Scanner s=new Scanner(System.in);
		a=s.next().charAt(0);
		b=s.next().charAt(0);
		if(a>b) {
			System.out.println(b+","+a);
		}
		else {
			System.out.println(a+","+b);
		}
		s.close();
	}
}
