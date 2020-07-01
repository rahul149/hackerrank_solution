import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long solve(int[] arr) {
        long l=0;
        long m;
        //Integer[] xr= Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for(int i=0;i<arr.length-1;i++)
        {  
            for(int j=i+1;j<arr.length;j++)
            {   long p=arr[i];
                m=arr[i]*p;
                int[] ar=Arrays.copyOfRange(arr,i,j);
                int max=Arrays.stream(ar).max().getAsInt();
                if(m<=max)
                l++;
            }
        
        }
        return l;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        long result = solve(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
