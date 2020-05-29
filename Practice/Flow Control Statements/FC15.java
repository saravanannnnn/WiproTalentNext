import java.util.Scanner;

public class FC15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int sum=0;
		for(int i=x;i!=0;i/=10) {
			sum+=i%10;
		}
		System.out.print(sum);
		s.close();
	}
}
