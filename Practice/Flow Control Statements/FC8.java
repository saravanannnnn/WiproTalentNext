import java.util.Scanner;

public class FC8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		switch(ch) {
		case 'R':
			System.out.print("Red");
			break;
		case 'B':
			System.out.print("Blue");
			break;
		case 'G':
			System.out.print("Green");
			break;
		case 'O':
			System.out.print("Orange");
			break;
		case 'Y':
			System.out.print("Yellow");
			break;
		case 'W':
			System.out.print("White");
			break;
		default:
			System.out.print("Invalid Code");
		}
		s.close();
	}
}
