public class FC13 {

	public static void main(String[] args) {
		int flag;
		for(int x=10;x<99;x++) {
			flag=0;
			for(int i=2;i<=Math.sqrt(x);i++) {
				if(x%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(x);
			}
		}
	}
}
