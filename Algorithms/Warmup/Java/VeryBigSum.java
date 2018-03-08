/*
Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Complete the function aVeryBigSum which takes  arguments, an integer  and a long integer array  and returns a long integer denoting the sum of all array elements.

Constraints

Raw Input Format

The first line of the input consists of an integer . 
The next line contains  space-separated integers contained in the array.

Sample Input 0

5
1000000001 1000000002 1000000003 1000000004 1000000005
Sample Output 0

5000000015
Note:

The range of the 32-bit integer is .
When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        long sum= 0;
        for(int i=0;i<n;i++)
            sum+=ar[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}

