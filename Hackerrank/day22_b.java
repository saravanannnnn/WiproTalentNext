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
     * Complete the 'fibonacci' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> fibonacci(int n) {
    // Write your code here
    int a=-1,b=1,c=0;
    List<Integer> fib=new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        c=a+b;
        fib.add(c);
        a=b;
        b=c;
    }
    return fib;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.fibonacci(n);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
