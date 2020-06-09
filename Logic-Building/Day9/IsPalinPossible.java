import java.io.*;
import java.util.*;

class UserMainCode
{
	public int IsPalinPossible(int input1)
	{
		String s=String.valueOf(input1);
		int x=0;
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		for(Character ch:set){
			int count=0;
			for(int i=0;i<s.length();i++){
				if(ch==s.charAt(i)){
					count++;
				}
			}
			if(count%2==1){
				x++;
			}
		}
		if(x>1){
			return 1;
		}
		else{
			return 2;
		}
	}
}				
