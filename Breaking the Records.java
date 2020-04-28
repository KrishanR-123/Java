import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //Number of scores
        
        int high = in.nextInt();
        int low = high;
        int highRecordsBroken = 0;
        int lowRecordsBroken = 0;
        
        for(int score=1; score < n; score++){
            int s = in.nextInt();
            
            if(s > high){
                high = s;
                highRecordsBroken++;
            }
            
            if(s < low){
                low = s;
                lowRecordsBroken++;
            }
        }
        System.out.println(highRecordsBroken + " " + lowRecordsBroken);
    }
}
