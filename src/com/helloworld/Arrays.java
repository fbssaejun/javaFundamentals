package com.helloworld;

import static java.util.Arrays.deepToString;

public class Arrays {
    public static void main(String[] args) {
        //Creates multi dimension array with arguments
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        //Deep to string can read multi dimension arrays
        System.out.println(deepToString(numbers));
    }
}
