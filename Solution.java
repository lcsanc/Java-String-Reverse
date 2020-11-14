/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)

Sample Input

madam
Sample Output

Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int end = A.length();
        int palindrome = 0;  
        for(int i=0; i < (A.length())/2; i++)
        {
            //System.out.println(A.substring(i,i+1) + " " + A.substring(end-1,end));
            if(A.substring(i,i+1).equals(A.substring(end-1,end))==true)
            {
               palindrome++; 
            }
            end--;
        }
        //System.out.println(palindrome);
        //System.out.println(((A.length())/2));
        if (palindrome == ((A.length())/2))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
    }
}