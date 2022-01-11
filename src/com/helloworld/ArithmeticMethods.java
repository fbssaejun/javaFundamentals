package com.helloworld;

public class ArithmeticMethods {
    protected void main(String[] x) {
        int num = 10 / 3; // => Output: 3
        double result = (double)10 / (double)3; // => Output:3.3333333333333335D
        System.out.println(num);
        System.out.println(result);
    }

    protected void increment() {
        int x = 1;
        x++;
        System.out.println(x); // => 2
    }

    protected void increment2() {
        int x = 1;
        //The value '1' gets assigned to y first, then the value of x increments
        int y = x++;
        System.out.println(x); // => 2
        System.out.println(y); // => 1
    }
}
