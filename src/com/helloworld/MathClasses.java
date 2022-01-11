package com.helloworld;

public class MathClasses {
    public static void main(String[] args) {
        int a = Math.round(1.1F);
        System.out.println(a); // => 1
        int b = (int)Math.ceil(1.1F);
        System.out.println(b); // => 2
        int c = (int)Math.floor(1.1F);
        System.out.println(c); // => 1
        int d = Math.max(1,2);
        System.out.println(d); // => 2
        int e = (int)Math.round(Math.random() * 100);
        System.out.println(e); // => Random number between 0 - 100
    }
}
