import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


    public static void staircase(int n) 
    {
        for(int i=1 ; i <=  n ; i++)
        {
            for(int s=1 ; s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int h=1;h<= i;h++ )
            {
                System.out.print("#");
            }
            System.out.println();
        }
    

    }

}

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
