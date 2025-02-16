package com.java.hackerrack;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*You are in charge of the cake for a child's birthday. It will have one candle for each year of
 their total age. They will only be able to blow out the tallest of the candles. Your task is to
 count how many candles are the tallest.

Example


The tallest candles are 4 units high. There are 2 candles with this height, so the function should return 2.

Function Description

Complete the function  with the following parameter(s):

        : the candle heights
        Returns

: the number of candles that are tallest
Input Format

The first line contains a single integer, , the size of .
The second line contains  space-separated integers, where each integer  describes the height of .

Constraints

Sample Input 0

        4
        3 2 1 3
Sample Output 0

        2
Explanation 0

Candle heights are . The tallest candles are  units, and there are  of them.*/
public class BirthDayCakeProblem {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Map<Integer, Long> map =
                candles.stream()
                        .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));


        Map<Integer, Long> sortedMap = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)
        );

        return sortedMap.entrySet().stream().findFirst().get().getValue().intValue();

    }
}

class TestBirthDayCake {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 4, 2, 4);

        System.out.println(BirthDayCakeProblem.birthdayCakeCandles(list));
    }
}