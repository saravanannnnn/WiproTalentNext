import java.util.Scanner;

public class FC7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		char c=ch;
		if(ch>='a') {
			ch-=32;
			System.out.println(c+"->"+ch);
		}
		else {
			ch+=32;
			System.out.println(c+"->"+ch);
		}
		s.close();
	}
}
