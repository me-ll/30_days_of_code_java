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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = "";
        while (n > 0){
            int remainder = n%2;
            n = n/2;
            result = remainder + String.valueOf(result);
        }
        // System.out.println(result); // 5 -> 101

        int tmp = 0;
        int count = 0;
        char[] ch = result.toCharArray();
        for (char c : ch) { 
            // System.out.println(c); 

            if (c == '1'){
                tmp++;
            } else {
                tmp = 0;
            }


            if (count < tmp){
                count = tmp;
            }
        } 

        System.out.println(count); 

        scanner.close();
    }
}
