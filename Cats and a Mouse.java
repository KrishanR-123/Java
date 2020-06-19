import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int tc = 0; tc < q; tc++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(solve(x, y, z));
        }

        sc.close();
    }

