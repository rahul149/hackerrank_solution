// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Deque<Integer> s1 = new ArrayDeque<Integer>();
        Deque<Integer> s2 = new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
        {   int cmd=sc.nextInt();
            if(cmd==1)
            { 
                s1.push(sc.nextInt());  
            }
            else if(cmd == 2) {
                if(s2.isEmpty()) {
                    while(!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
                   
                }  
                s2.pop();
            }       
            else if(cmd == 3) {
               if(s2.isEmpty()) {
                    while(!s1.isEmpty()) {
                        s2.push(s1.pop());
                    }
               }
               System.out.println(s2.peek()); 
            }
        }
    }

 }
    
