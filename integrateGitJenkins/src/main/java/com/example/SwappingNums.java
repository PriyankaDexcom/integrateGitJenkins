package com.example;

public class SwappingNums {

    public void swap (int x, int y) {
        int temp = x;
        x = y;
        y= temp;
        System.out.println("X i s: " + x);
        System.out.println("Y i s: " + y);
    }

    public void swap1 (int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X i s: " + x);
        System.out.println("Y i s: " + y);
    }

    public static void main(String[] args) {
        SwappingNums obj = new SwappingNums();
        SwappingNums obj1 = new SwappingNums();
        obj.swap(4,5);
        obj1.swap(4,5);
        if(obj1.equals(obj) ){
            System.out.println(" Equals");
        } else {
            System.out.println(" NOT Equals");
        }

        if(obj1 == obj){
            System.out.println(" @@@@@@@Equals");
        } else {
            System.out.println(" @@@@@@@@NOT Equals");
        }
    }
}
