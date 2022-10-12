package com.example;

import java.util.ArrayList;
import java.util.List;

public class MaxMinNumber{

    public static void main(String[] args){
        List<Integer> muList = new ArrayList<Integer>();
        muList.add(78);
        muList.add(51);
        muList.add(6564);
        muList.add(4646546);
        muList.add(37);
        muList.add(4656);
        muList.add(56565);
        muList.add(6565);
        System.out.println("The list is : " + muList);
        int max = muList.get(0);
        int min = muList.get(0);
        for (int i=1 ; i < muList.size() ; i++) {
            if (muList.get(i) > max){
                max = muList.get(i);
            }
            if (muList.get(i) < min){
                min = muList.get(i);
            }
        }
        System.out.println("The max number is : " + max);
        System.out.println("The min number is : " + min);
    }
}
