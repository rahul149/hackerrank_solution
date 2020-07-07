import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        int l=s.length();
        
        int row=(int)Math.floor(Math.sqrt(l));
        int col=(int)Math.ceil(Math.sqrt(l));
        String ss=new String();
        for(int i=0;i<col;i++)
        { for(int j=i;j<s.length();j=j+col)
            ss=ss+s.charAt(j);
            ss=ss+" ";
        }
        return ss;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
