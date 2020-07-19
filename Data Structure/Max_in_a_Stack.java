import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Deque<Integer> s1 = new ArrayDeque<Integer>();
       int max=0;
        for(int i=0;i<n;i++)
        {   int cmd=sc.nextInt();
            if(cmd==1)
            {   int x=sc.nextInt();
                s1.push(x);
                
                if(i==0)
                max=x;
                else if(x>max)  
                        max=x;
                
            }
            else if(cmd == 2) {
                s1.pop();
                 Deque<Integer> s2 = new ArrayDeque<Integer>();
                 max=0;
                 while(!s1.isEmpty())
                 { 
                     if(max<s1.peek())
                        max=s1.peek();
                    s2.push(s1.pop());
                 }
                 while(!s2.isEmpty())
                 { 
                     
                    s1.push(s2.pop());
                 }

            }       
            else if(cmd == 3) {
               
               System.out.println(max); 
            }
        }
    }
}
