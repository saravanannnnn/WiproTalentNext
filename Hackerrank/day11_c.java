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
     * Complete the 'maxXor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER lo
     *  2. INTEGER hi
     *  3. INTEGER k
     */

    public static int maxXor(int lo, int hi, int k) {
    // Write your code here
    int out=0;
    for(int i=lo;i<hi;i++){
        for(int j=i+1;j<=hi;j++){
            int x=i^j;
            if(out<x && x<=k){
                out=x;
            }
        }
    }
    return out;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int lo = Integer.parseInt(bufferedReader.readLine().trim());

        int hi = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.maxXor(lo, hi, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
