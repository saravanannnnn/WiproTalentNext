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
     * Complete the 'countPalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int countPalindromes(String s) {
    // Write your code here
    StringBuilder str=new StringBuilder();
    str.append(s);
    int count=str.length();
    for(int i=0;i<str.length()-1;i++){
        for(int j=i+2;j<=str.length();j++){
            String temp=str.substring(i,j);
            StringBuilder temp1=new StringBuilder();
            temp1.append(temp);
            temp1.reverse();
            if(temp.compareTo(temp1.toString())==0){
                count++;
            }
            temp1.delete(0,temp1.length());
        }
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.countPalindromes(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
