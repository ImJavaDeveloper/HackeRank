package com.java.hackerrack;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BirthDayCakeProblem {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Map<Integer,Long> map=
                candles.stream()
                        .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()));


        Map<Integer,Long> sortedMap=map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
                Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new)
        );

        return sortedMap.entrySet().stream().findFirst().get().getValue().intValue();

    }
}

class TestBirthDayCake{
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,3,4,2,4);

        System.out.println(BirthDayCakeProblem.birthdayCakeCandles(list));
    }
}