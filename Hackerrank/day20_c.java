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
     * Complete the 'checkDivisibility' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static List<String> checkDivisibility(List<String> arr) {
    // Write your code here
    List<String> out=new ArrayList<String>();
    for(int i=0;i<arr.size();i++){
        int temp=0;
        char[] ch=arr.get(i).toCharArray();
        if(ch.length>=3){
            for(int j=0;j<ch.length-2;j++){
                String s1=ch[j]+""+ch[j+1]+""+ch[j+2];
                String s2=ch[j]+""+ch[j+2]+""+ch[j+1];
                String s3=ch[j+1]+""+ch[j]+""+ch[j+2];
                String s4=ch[j+1]+""+ch[j+2]+""+ch[j];
                String s5=ch[j+2]+""+ch[j]+""+ch[j+1];
                String s6=ch[j+2]+""+ch[j+1]+""+ch[j];
                int a=Integer.valueOf(s1);
                int b=Integer.valueOf(s2);
                int c=Integer.valueOf(s3);
                int d=Integer.valueOf(s4);
                int e=Integer.valueOf(s5);
                int f=Integer.valueOf(s6);
                if(a%8==0 || b%8==0 || c%8==0 || d%8==0 || e%8==0 || f%8==0){
                    out.add("YES");
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                out.add("NO");
            }
        }
        else if(ch.length==2){
            String s1=ch[0]+""+ch[1];
            String s2=ch[1]+""+ch[0];
            int a=Integer.valueOf(s1);
            int b=Integer.valueOf(s2);
            if(a%8==0 || b%8==0){
                out.add("YES");
            }
            else{
                out.add("NO");
            }
        }
        else{
            String s=ch[0]+"";
            int a=Integer.valueOf(s);
            if(a%8==0){
                out.add("YES");
            }
            else{
                out.add("NO");
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

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.checkDivisibility(arr);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
