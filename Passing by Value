package com.company;
class PassValue {
    int func(int m, int n) {     //defining method
        m += 4;
        n -= 2;
        return m+n;

    }
}
public class Main {

    public static void main(String[] args) {
	int i=2, j=8;
	PassValue obj1 = new PassValue();
	PassValue obj2 = new PassValue();
	System.out.println("Func output = " + obj1.func(i,j));
	System.out.println("i = " + i + ", j ="+ j);
        System.out.println("Func output = " + obj2.func(i,j));
        System.out.println("i = " + i + ", j ="+ j);

    }
}
/* output:
  Func output = 12
i = 2, j =8
Func output = 12
i = 2, j =8

Process finished with exit code 0
The initial values do not change. If the method is called again, the same copies of value are again passed*/
