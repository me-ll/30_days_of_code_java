import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                // System.out.print(arrItem);
            }
                // System.out.println();

        }
        // System.out.println(Arrays.toString(arr));


        int sum[] = new int[16];
        int k = 0;
        for (int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
                sum[k] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                    + arr[i+1][j+1] 
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                k++;
            }

        }
        // System.out.println(Arrays.toString(sum));

        // int result = 0;
        // for (int i = 0; i < sum.length; i++){
        //     if(result < sum[i]){
        //         result = sum[i];
        //     }
        // }
        Arrays.sort(sum);
        System.out.print(sum[sum.length-1]);

        scanner.close();
    }
}
