import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRINGs as parameter.
     */

    public static String superReducedString(String s) 
    {
    // Write your code here
        StringBuilder sb=new StringBuilder(s);
        int i=1;
        while(i<sb.length())
        {
            if(sb.charAt(i)==sb.charAt(i-1))
            {
                sb.delete(i-1, i+1);
                i=1;
            }
            else
            {
                i++;
            }
        }
        if(sb.length()==0)
        {
            return "Empty String";
        }
        else
        {
            return sb.toString();
        }             

    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


