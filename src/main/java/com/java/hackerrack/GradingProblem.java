package com.java.hackerrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingProblem {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        for (Integer grade : grades) {
            Integer nextRoundVal = ((grade.intValue() / 5) + 1) * 5;
            if ((nextRoundVal.intValue() - grade.intValue()) < 3 && grade.intValue() >= 38) {
                results.add(nextRoundVal);
            } else {
                results.add(grade);
            }
        }
        return results;
    }
}

class TestGradingProblem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(73, 67, 38, 30);
        System.out.println(GradingProblem.gradingStudents(list));
        int a = 0;
        int b = 2;
        int n = 10;

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = 0; k <= j; k++) {
                sum = sum + (int) Math.pow(2, j) * b;
            }
            System.out.print(a + sum);
            System.out.print(" ");
        }
    }
}
