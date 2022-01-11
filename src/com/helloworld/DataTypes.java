package com.helloworld;

import java.awt.*;
import java.util.Date;

public class DataTypes {

    public static void main(String[] args) {

        //Primitive Types
        byte myAge = 30;
        long viewsCount = 3_123_455_677L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        if(isEligible) {
            System.out.println("Yay");
        }

        //Reference Types
        Date now = new Date();
//        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;

        System.out.println(point1);
        System.out.println(point2);

        //Primitive type's values are completely independent
        byte a = 1;
        byte b = a;
        a = 2;
        System.out.println(b);
    }
}
