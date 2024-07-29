package com.java.hackerrack;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveOnesProblem {

    public static int getCount(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            int rem = n % 2;
            n = n / 2;
            list.add(rem);
        }
        int max = 1;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {

            if (list.get(i) == 1)
                count++;
            else
                count = 0;

            if (count > max)
                max = count;
        }
        return max;
    }

}

class TestConsecutiveProblem {
    public static void main(String[] args) {

        System.out.println(ConsecutiveOnesProblem.getCount(439));

    }
}
