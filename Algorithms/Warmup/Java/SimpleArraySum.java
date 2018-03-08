/*
Given an array of integers, find the sum of its elements.

Complete the simpleArraySum function which takes  arguments, an integer  and an integer array  and returns an integer denoting the sum of all array elements.

Raw Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers representing the array's elements.

Sample Input 0

6
1 2 3 4 10 11
Sample Output 0

31
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+ar[i];
        }
        
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}

