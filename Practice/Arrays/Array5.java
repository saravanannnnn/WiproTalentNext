import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int max1,max2,min1,min2;
		if(n==1) {
			System.out.print(a[0]);
		}
		else {
			if(a[0]>a[1]) {
				max1=a[0];
				max2=a[1];
				min1=a[1];
				min2=a[0];
			}
			else {
				max1=a[1];
				max2=a[0];
				min1=a[0];
				min2=a[1];
			}
			for(int i=2;i<n;i++) {
				if(a[i]>max2) {
					if(a[i]>max1) {
						max2=max1;
						max1=a[i];
					}
					else {
						max2=a[i];
					}
				}
				if(a[i]<min2) {
					if(a[i]<min1) {
						min2=min1;
						min1=a[i];
					}
					else {
						min2=a[i];
					}
				}
			}
			System.out.println("Largest: "+max1);
			System.out.println("Second Largest: "+max2);
			System.out.println("Smallest: "+min1);
			System.out.println("Second Smallest: "+min2);
		}
		s.close();
	}
}
