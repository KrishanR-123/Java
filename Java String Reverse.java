import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
        String S = in.next();
        StringBuilder S1 = new StringBuilder();
        S1.append(S);
        S1=S1.reverse();

        if(S.equals(S1.toString()) == true)
        {
            System.out.println("Yes");
        }

        else
        {
            System.out.println("No");
        }
    }
}



