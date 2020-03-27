import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
  Scanner s = new Scanner(System.in);
  int n;
  n = s.nextInt();
  int grades[] = new int[n];
  for(int i=0; i<n; i++)
  {
      grades[i]=s.nextInt();
  }
  for(int j=0; j<n; j++)
  {
      if(grades[j]>=38)
      {
          if(grades[j]+(5-grades[j]%5)-grades[j]<3)
          {
              grades[j]=grades[j]+(5-grades[j]%5);
              System.out.println(grades[j]);
          }
          else
          {
              System.out.println(grades[j]);
          }
          
      }
      else
          {
              System.out.println(grades[j]);
          }
  }
    }
}
