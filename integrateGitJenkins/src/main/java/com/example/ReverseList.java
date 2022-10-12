package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumInList {
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
        int size = muList.size();
        int[] rev = new int[size];
        for (int j =0 ; j < size; j++){
            rev[j] = muList.get(size - (j+1));
        }
        System.out.println("The rev array is : " + Arrays.toString(rev));
    }
}

