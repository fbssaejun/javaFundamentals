package com.helloworld;

public class Casting {
    public static void main(String[] args) {
        //Implicit Casting
        //byte > short > int > long
        short x = 1;
        int y = x + 2;
        System.out.println(y); // => 3

        //Explicit Casting
        double w = 1.1;
        int z = (int)w + 2;
        System.out.println(z); // => 3

        //Type coercing different primitive types
        String a = "1.1";
        double b = Double.parseDouble(a) + 2;
        System.out.println(b); // => 3
    }
}
