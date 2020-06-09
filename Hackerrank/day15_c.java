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
     * Complete the 'itemsSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY items as parameter.
     */

    public static List<Integer> itemsSort(List<Integer> items) {
    // Write your code here
    int size=items.size();
    int[][] arr=new int[size][2];
    int i=0,index=0;
    while(i<size){
        int temp=0,x=0;
        for(int j=0;j<index;j++){
            if(arr[j][0]==items.get(i)){
                temp=1;
                x=j;
            }
        }
        if(temp==0){
            arr[index][0]=items.get(i);
            arr[index][1]=1;
            index++;
        }
        else{
            arr[x][1]++;
        }
        i++;
    }
    for(i=0;i<index-1;i++){
        for(int j=i+1;j<index;j++){
            if(arr[i][1]>arr[j][1]){
                int temp1=arr[i][0];
                int temp2=arr[i][1];
                arr[i][0]=arr[j][0];
                arr[i][1]=arr[j][1];
                arr[j][0]=temp1;
                arr[j][1]=temp2;
            }
            if(arr[i][1]==arr[j][1]){
                if(arr[i][0]>arr[j][0]){
                int temp1=arr[i][0];
                int temp2=arr[i][1];
                arr[i][0]=arr[j][0];
                arr[i][1]=arr[j][1];
                arr[j][0]=temp1;
                arr[j][1]=temp2;
                }
            }
        }
    }
    List<Integer> list=new ArrayList<Integer>();
    for(i=0;i<index;i++){
        for(int j=0;j<arr[i][1];j++){
            list.add(arr[i][0]);
        }
    }
    return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int itemsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> items = IntStream.range(0, itemsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.itemsSort(items);

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
