package com.helloworld;

import java.text.NumberFormat;

public class FormatNumbers {
    public static void main(String[] args) {
        //Converts number to currency
        String result = NumberFormat.getCurrencyInstance().format(123456.231);
        System.out.println(result); // => $123,456.23

        //Converts decimal points to percentage
        String result2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2); // => 10%
    }
}
