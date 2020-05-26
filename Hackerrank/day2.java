import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        String str=new String();
        StringBuilder out=new StringBuilder();
        int x=0;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        if(str.contains("a")){
            out.append("a");
            x=1;
        }
        if(str.contains("e")){
            out.append("e");
            x=1;
        }
        if(str.contains("i")){
            out.append("i");
            x=1;
        }
        if(str.contains("o")){
            out.append("o");
            x=1;
        }
        if(str.contains("u")){
            out.append("u");
            x=1;
        }
        if(x==0){
            System.out.print("Thank You");
        }
        else{
            System.out.println(out);
        }
        
    }
}