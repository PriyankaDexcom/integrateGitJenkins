package com.example;

import java.util.ArrayList;

public class macProduct {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(55);
        num.add(7);
        num.add(2);
        num.add(100);
        int temp = 0;
        int max_i = 0;
        int max_j = 0;
        for (int i=0 ; i<(num.size() -1); i++) {
            for (int j=1 ; j < num.size(); j++) {
                int pro = num.get(i) * num.get(j);
                if (pro > temp) {
                    temp = pro;
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println("The product is " + temp);
        System.out.println("The integers are " + max_i + " & " + max_j);
    }
}
