package com.example;

public class OddNumber {

    public int oddNumberIndex(int n, int[] list){
        int count =0;
        int index = 0;
        for (int i=0; i< list.length; i++) {
            if ((list[i] / 2) == 1) {
                count += 1;
                if (count == n) {
                    index =  list[i];
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] list = {3,2,2,4,1,4,5,3};
        OddNumber oddNumber = new OddNumber();
        int index = oddNumber.oddNumberIndex(4, list);
        System.out.println(" the 4th odd element is : " + index);
    }

}
