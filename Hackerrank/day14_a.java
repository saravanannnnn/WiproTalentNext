import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMaxDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMaxDeletions(String s) {
    // Write your code here
    int u=0,d=0,l=0,r=0,x=0,y=0;
    for(int i=0;i<s.length();i++){
        switch(s.charAt(i)){
            case 'U':
            u++;
            break;
            case 'D':
            d++;
            break;
            case 'L':
            l++;
            break;
            case 'R':
            r++;
            break;
        }
    }
    if(u>d){
        y=u-d;
    }
    else{
        y=d-u;
    }
    if(l>r){
        x=l-r;
    }
    else{
        x=r-l;
    }
    return s.length()-(x+y);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getMaxDeletions(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
