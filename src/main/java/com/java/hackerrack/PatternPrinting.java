package com.java.hackerrack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PatternPrinting {

    public static void staircase(int n) {

        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("#");

            System.out.println();
        }

    }
}

class TestPattern
{
    public static void main(String[] args) {
        PatternPrinting.staircase(10);

        List<Integer> list= Arrays.asList(1,5,6,9);
        int sum=list.stream().reduce(Integer::sum).get();
        int sum2= list.stream().mapToInt(Integer::intValue).sum();
        long sum3=list.stream().collect(Collectors.summingLong(x->x.longValue()));
        System.out.println(sum);
        System.out.println(sum2);
    }
}
