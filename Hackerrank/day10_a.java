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
     * Complete the 'minOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minOperations(List<Integer> arr) {
    // Write your code here
    int count1=0,count2=0,size=arr.size(),i=0;
    while(i<size-1){
        if(i%2==0){
            if(arr.get(i)>=arr.get(i+1)){
                count1++;
                i+=2;
                continue;
            }
        }
        else{
            if(arr.get(i)<=arr.get(i+1)){
                count1++;
                i+=2;
                continue;
            }
        }
        i++;
    }
    i=0;
    while(i<size-1){
        if(i%2==0){
            if(arr.get(i)<=arr.get(i+1)){
                count2++;
                i+=2;
                continue;
            }
        }
        else{
            if(arr.get(i)>=arr.get(i+1)){
                count2++;
                i+=2;
                continue;
            }
        }
        i++;
    }
    if(count1<count2){
        return count1;
    }
    else{
        return count2;
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minOperations(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
