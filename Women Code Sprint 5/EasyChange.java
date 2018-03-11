/*
Shopkeepers often round up the change during a purchase so that the change to be given can be a single bill, making it convenient for both the shopkeeper and the customer.

For example, a customer has paid a 200 peso bill for a purchase of 104 pesos. If the customer then gives an additional 4 pesos, then the cashier will give an exact 100 peso bill in change, instead of several bills and coins if the change is 96  pesos.

They only typically ask for up to  pesos, since any more would be too inconvenient for the customer. Assume that the available bill denominations are: 20,50, 100,200,500 , 1000  pesos.

Complete the function howMuchToAsk which takes the cost of purchase and the amount the customer has paid, in pesos, and returns the amount the cashier should ask the customer. If the change can already be represented as a single bill, then return 0. If this amount exceeds 9 pesos, then return -1 instead.

Input Format

The first line of input contains t, the number of scenarios. The following lines describe the scenarios.

Each scenario is described by a single line containing two space-separated integers, c and p, denoting the cost of purchase for that scenario and the amount the customer has paid, in pesos.

Constraints

Output Format

For each scenario, print a single line containing a single integer denoting the amount the cashier should ask the customer. If the change can already be represented as a single bill, then print 0. If this amount exceeds 9 , then print -1 instead.

Sample Input 0

3
104 200
370 420
20 50
Sample Output 0

4
0
-1
Explanation 0

In the first scenario, we have c=104 and p=200 . This scenario corresponds to the example provided in the problem statement.

In the second scenario, we have c=370 and p=420 . In this scenario, the required change is 50  pesos which can already be represented as a single bill. Hence, the answer is 0.

In the third scenario,  c=20 and p=50. Here, the cashier has to ask for 10 pesos which exceeds  pesos, hence the answer is -1.
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  
    
    /*
     * Complete the howMuchToAsk function below.
     */
    static int howMuchToAsk(int c, int p) {
        /*
         * Return the amount the cashier should ask the customer or -1 if this exceeds 9.
         */
          int ar[]={20,50,100,200,500,1000};
    int res=p-c;
        
    if(res==20||res==50||res==100||res==200||res==500||res==1000)
        return 0;
        
    for(int i=0;i<ar.length;i++){
        if(res<ar[i]){
            res=ar[i]-res;
            break;}
        
    }
    
    if(res<=9)
        return res;
    else
        return -1;
    

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scan.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] cp = scan.nextLine().split(" ");

            int c = Integer.parseInt(cp[0].trim());

            int p = Integer.parseInt(cp[1].trim());

            int result = howMuchToAsk(c, p);

            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.close();
    }
}

