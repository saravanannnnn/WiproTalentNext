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
     * Complete the 'isPangram' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY pangram as parameter.
     */

    public static String isPangram(List<String> pangram) {
    // Write your code here
    StringBuilder str=new StringBuilder();
    for(String s:pangram){
        HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()>26){
            str.append("1");
        }
        else{
            str.append("0");
        }
    }
    return str.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int pangramCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> pangram = IntStream.range(0, pangramCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        String result = Result.isPangram(pangram);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
