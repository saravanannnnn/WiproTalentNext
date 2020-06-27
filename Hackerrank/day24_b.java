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
     * Complete the 'groupSort' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<List<Integer>> groupSort(List<Integer> arr) {
    // Write your code here
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
    for(int x:arr){
        if(map.containsKey(x)){
            map.replace(x,map.get(x)+1);
        }
        else{
            map.put(x,1);
        }
    }
    for(Map.Entry m:map.entrySet()){
        List<Integer> t=new ArrayList<Integer>();
        t.add((int)m.getKey());
        t.add((int)m.getValue());
        list.add(t);
    }
    for(int i=0;i<list.size()-1;i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i).get(1)<list.get(j).get(1)){
                List<Integer> t=new ArrayList<Integer>();
                t.add(list.get(i).get(0));
                t.add(list.get(i).get(1));
                list.set(i,list.get(j));
                list.set(j,t);
            }
            else if(list.get(i).get(1)==list.get(j).get(1)){
                if(list.get(i).get(0)>list.get(j).get(0)){
                List<Integer> t=new ArrayList<Integer>();
                t.add(list.get(i).get(0));
                t.add(list.get(i).get(1));
                list.set(i,list.get(j));
                list.set(j,t);
                }
            }
        }
    }
    return list;
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

        List<List<Integer>> result = Result.groupSort(arr);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
