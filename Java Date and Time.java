import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) 
    {
        Calendar myClass=Calendar.getInstance();
        myClass.set(year,month-1,day);
        int date=myClass.get(Calendar.DAY_OF_WEEK);
        date--;
        if(date==0)
            date=7;
        String getDate=new String();
        switch(date)
        {
            case 1: getDate="MONDAY"; break;
            case 2: getDate="TUESDAY"; break;
            case 3: getDate="WEDNESDAY"; break;
            case 4: getDate="THURSDAY"; break;
            case 5: getDate="FRIDAY"; break;
            case 6: getDate="SATURDAY"; break;
            case 7: getDate="SUNDAY"; break;
        }
        return getDate;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
