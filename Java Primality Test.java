import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}


 //or//

package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n<=1)
        {System.out.println("not prime");}

           else {
            for (i = 1; i < n; i++) {
                if (n % i == 0)
                    System.out.println("not prime");

                else
                    System.out.println("prime");

                break;
            }
        }

    }
}
