import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        if(s.isEmpty())
        {
            System.out.println("0");
            System.exit(0);
        }
        
        int words = 1;
        
        for(char letter : s.toCharArray())
        {
            if(letter < 91 && letter > 64 )
            {
                words++;
            }
        }
        System.out.println(words);
    }
}
