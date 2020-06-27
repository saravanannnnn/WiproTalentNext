import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */

    public static long countMax(List<String> upRight) {
    // Write your code here
    int x=1,y=1,z=0,max=0;long count=0;
    int[][] rc=new int[upRight.size()][2];
    for(String t:upRight){
        String[] s=t.split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        rc[z][0]=a;
        rc[z][1]=b;
        z++;
        if(x<a){
            x=a;
        }
        if(y<b){
            y=b;
        }
    }
    int[][] arr=new int[x][y];
    for(int i=0;i<z;i++){
        int a=rc[i][0];
        int b=rc[i][1];
        for(int j=0;j<a;j++){
            for(int k=0;k<b;k++){
                arr[j][k]++;
                if(max<arr[j][k]){
                    max=arr[j][k];
                }
            }
        }
    }
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            if(arr[i][j]==max){
                count++;
            }
        }
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int upRightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> upRight = new ArrayList<>();

        for (int i = 0; i < upRightCount; i++) {
            String upRightItem = bufferedReader.readLine();
            upRight.add(upRightItem);
        }

        long result = Result.countMax(upRight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
