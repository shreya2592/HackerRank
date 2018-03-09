/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

Complete the diagonalDifference function which takes a  integer array as a parameter and return an integer denoting the absolute difference between the diagonal sums.

Constraints

Raw Input Format

The first line contains a single integer,  denoting the number of rows and columns in the matrix . 
The next  lines denote the matrix 's rows, with each line containing  space-separated integers describing the columns.

Sample Input 0

3
11 2 4
4 5 6
10 8 -12
Sample Output 0

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a, int n) {
    
        int psum=0, ssum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    psum+=a[i][j];
            }
        }
                   

            for (int i=0,j=n-1; i<n && j>=0; i++, j--){
               
                ssum+=a[i][j];
            }
            
            
            int res= Math.abs(psum-ssum);
        
            return res;
                
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}

