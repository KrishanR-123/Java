import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int counter[] = new int[6];
        int result = 1; int max = 0;
        for (int i = 0; i < n; i++) {
            counter[ar[i]]++;
        }

        for (int i = 1; i <= 5; i++) {
            if (counter[i] > max) {
                result = i;
                max = counter[i];
            }
        }

        return result;
    }
  
  
