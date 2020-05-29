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
     * Complete the 'maxTrailing' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maxTrailing(List<Integer> arr) {
    // Write your code here
    int i,j=arr.size(),out=0,temp,index=0;
    List<Integer> z=new ArrayList<Integer>();
    while(j>0){
        i=j-1;
        while(i>=0){
            if(arr.get(j)>arr.get(i)){
                temp=arr.get(j)-arr.get(i);
                z.add(index,temp);
                index++;
                i--;
            }
            else{
                break;
            }
        }
        j=i;
    }
    for(i=0;i<index;i++){
        if(z.get(i)>out){
            out=z.get(i);
        }
    }
    if(out>0){
        return out;
    }
    return -1;

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

        int result = Result.maxTrailing(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
