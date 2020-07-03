import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int MIN(int x,int y){
        if(x<=y)
        return x;
        return y;
    }
    // Complete the surfaceArea function below.
    static int surfaceArea(int[][] A) {
    int s=0,side=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                s=s+(A[i][j]*2)-2;
                side=side+(A[i][j]*6);
                if(A.length==1 && A[i].length==1)
                { s=0;}
                else
                if(i==0)
                {
                    if(j==0)
                    { s = s + MIN(A[i][j],A[i][j+1]) + MIN(A[i][j],A[i+1][j]); }
                    else if(j==(A[i].length-1))
                            { s=s=s+MIN(A[i][j],A[i][j-1])+MIN(A[i][j],A[i+1][j]);}
                            else {s=s=s+MIN(A[i][j],A[i][j+1])+MIN(A[i][j],A[i][j-1])+MIN(A[i][j],A[i+1][j]);}
                }else if(i==A.length-1)
                        { if(j==0)
                            { s=s+MIN(A[i][j],A[i][j+1])+MIN(A[i][j],A[i-1][j]);}
                            else if(j==(A[i].length-1))
                                { s=s=s+MIN(A[i][j],A[i][j-1])+MIN(A[i][j],A[i-1][j]);}
                            else {s=s=s+MIN(A[i][j],A[i][j+1])+MIN(A[i][j],A[i][j-1])+MIN(A[i][j],A[i-1][j]);}
                        } else {  if(j==0)
                                  { s=s+MIN(A[i][j],A[i][j+1])+MIN(A[i][j],A[i+1][j])+MIN(A[i][j],A[i-1][j]);}
                    else if(j==(A[i].length-1))
                            { s=s=s+MIN(A[i][j],A[i][j-1])+MIN(A[i][j],A[i+1][j])+MIN(A[i][j],A[i-1][j]);}
                            else {s=s=s+MIN(A[i][j],A[i][j+1])+MIN(A[i][j],A[i][j-1])+MIN(A[i][j],A[i+1][j])+MIN(A[i][j],A[i-1][j]);}
                                }
            }
        }
        return side-s;

    
    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
