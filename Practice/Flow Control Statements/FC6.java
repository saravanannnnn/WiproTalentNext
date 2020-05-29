public class FC6 {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[1]);
		String gender=args[0];
		if(age>=1 && age<=120) {
			if(age<=58 && gender.equalsIgnoreCase("Female")) {
				System.out.println("Interest=8.2%");
			}
			else if(age>58 && gender.equalsIgnoreCase("Female")) {
				System.out.println("Interest=7.6%");
			}
			else if(age<=60 && gender.equalsIgnoreCase("Male")) {
				System.out.println("Interest=9.2%");
			}
			else if(age>60 && gender.equalsIgnoreCase("Male")) {
				System.out.println("Interest=8.3%");
			}
			else {
				System.out.println("Invalid arguments");
			}
		}
	}
}
