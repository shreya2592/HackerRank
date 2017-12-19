/*

We say that a string, , contains the word hackerrank if a subsequence of the characters in  spell the word hackerrank. For example, haacckkerrannkk does contain hackerrank, but haacckkerannk does not (the characters all appear in the same order, but it's missing a second r).

More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.

You must answer  queries, where each query consists of a string, . For each query, print YES on a new line if contains hackerrank; otherwise, print NO instead.

Input Format

The first line contains an integer denoting  (the number of queries). 
Each line of the  subsequent lines contains a single string denoting .

Constraints

Output Format

For each query, print YES on a new line if  contains hackerrank; otherwise, print NO instead.

Sample Input 0

2
hereiamstackerrank
hackerworld
Sample Output 0

YES
NO
Explanation 0

We perform the following  queries:

 
The characters of hackerrank are bolded in the string above. Because the string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we print YES on a new line.
 does not contain the last three characters of hackerrank, so we print NO on a new line.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String hc="hackerrank";
            int len=s.length();
            int j=0;
            
            if(hc.length()>len)
                System.out.println("NO");
            
            for(int i=0;i<len;i++){
                if(j<hc.length() && s.charAt(i)==hc.charAt(j))
                    j++;
            }
                
            
            if(j==hc.length())
                System.out.println("YES");
            else
                System.out.println("NO");
                
                
            
            // your code goes here
        }
    }
}

