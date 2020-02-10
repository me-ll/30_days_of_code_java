import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); 

        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String inputLine = "";
        char[]  inputLineArray;

        for (int i = 0; i < n; i++){
            inputLine = scan.nextLine();
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            inputLineArray = inputLine.toCharArray();

            String odd = "";
            String even = "";
            for(int j = 0; j < inputLineArray.length; j++ ){ // 配列の.lengthは()必要ない

                if (j % 2 == 0){
                    even += inputLineArray[j];
                } else {
                    odd += inputLineArray[j];
                }
            }
            System.out.println(even + " " + odd);

        }

    }
        
}

