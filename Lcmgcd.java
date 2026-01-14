import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result 
{

    public static int getTotalX(List<Integer> a, List<Integer> b) 
    {
       int lcm = a.get(0);
       for(int i=1 ; i<a.size() ; i++)
       {
        lcm = lcm(lcm , a.get(i));
       }
       
       int gcd = b.get(0);
       for(int i=1 ; i< b.size();i++)
       {
        gcd = gcd(gcd , b.get(i));
       }
       
       int count= 0;
       for(int x=lcm; x<=gcd ; x+= lcm)
       {
        if(gcd %x == 0)
        {
            count++;
        }
       }
       return count;
    }
    //helper for gcd
        static int gcd(int a , int b)
        { 
            while(b != 0)
            {
                int temp = b;
                b= a % b;
                a = temp;
            }
            return a;
        }
        //helper for lcm
        static int lcm(int a , int b)
        {
            return (a*b) / gcd (a,b);
        }        
    }



public class Lcmgcd{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
