import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int x,count=0;
        StringBuilder str=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        while(x>0){
            if(x%2==0){
                str.append("0");
                x=x/2;
                count++;
            }
            else{
                str.append("1");
                x=x/2;
            }
        }
        str=str.reverse();
        System.out.println(str);
        System.out.print(count);
    }
}