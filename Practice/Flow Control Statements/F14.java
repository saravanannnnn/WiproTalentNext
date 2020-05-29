public class FC14 {

	public static void main(String[] args) {
		if(args.length>0) {
			int x=Integer.parseInt(args[0]);
			if(x==0 || x==1) {
				System.out.println(x+" is neither prime nor composite");
				return;
			}
			else {
				for(int i=2;i<Math.sqrt(x);i++) {
					if(x%i==0) {
						System.out.println(x+" is not a prime number");
						return;
					}
				}
				System.out.println(x+" is a prime number");
			}
		}
		else {
			System.out.println("Please enter an integer number");
		}
	}
}
