import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        
        int n = arr.length; 
        for (int i = 1; i < n; ++i) {   //Sorting the array first
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
         
        int sml=arr[1]-arr[0];
        List<Integer> pair= new ArrayList<Integer>();
        for(int j=1;j<arr.length;j++)     //find smallest diff. in adj. pairs
        { int d=arr[j]-arr[j-1];
              
            if(d==sml)
            { pair.add(arr[j-1]);
                pair.add(arr[j]);
            }
            else if(d<sml)
                 {
                     pair.clear();
                     pair.add(arr[j-1]);
                     pair.add(arr[j]);
                        sml=d;
                 }
        }
        int[] p = new int[pair.size()];
        for(int i = 0; i < pair.size(); i++) {
        p[i] = pair.get(i);
        }
        return p;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
