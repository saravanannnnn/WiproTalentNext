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
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER threshold
     */

    public static List<String> processLogs(List<String> logs, int threshold) {
    // Write your code here
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(String s:logs){
        String[] str=s.split(" ");
        int x=Integer.valueOf(str[0]);
        int y=Integer.valueOf(str[1]);
        if(x==y){
            if(map.containsKey(x)){
                map.replace(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        else{
            if(map.containsKey(x)){
                map.replace(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
            if(map.containsKey(y)){
                map.replace(y,map.get(y)+1);
            }
            else{
                map.put(y,1);
            }
        }
    }
    int a[][]=new int[map.size()][2];
    int index=0;
    for(Map.Entry m:map.entrySet()){
        if((int)m.getValue()>=threshold){
            a[index][0]=(int)m.getKey();
            a[index][1]=(int)m.getValue();
            index++;
        }
    }
    for(int i=0;i<index;i++){
        for(int j=i+1;j<index;j++){
            if(a[i][0]>a[j][0]){
                int t1=a[i][0];
                int t2=a[i][1];
                a[i][0]=a[j][0];
                a[i][1]=a[j][1];
                a[j][0]=t1;
                a[j][1]=t2;
            }
        }
    }
    List<String> s=new ArrayList<String>();
    for(int i=0;i<index;i++){
        s.add(String.valueOf(a[i][0]));
    }
    return s;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.processLogs(logs, threshold);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
