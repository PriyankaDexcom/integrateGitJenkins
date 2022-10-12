package com.example;

public class Testing {

    public static void main(String[] args) {
       String name = "Priyanka Agarwal";
       String name1 = "priyanka agarwal";
       System.out.println("The char at 8th position is "  + name.charAt(8));
       System.out.println("Compare "  + name.compareTo(name1));
       System.out.println("Compare "  + name.compareToIgnoreCase(name1));
       System.out.println("Concat "  + name.concat(name1));
       System.out.println("Contains "  + name.contains("priyanka"));
       System.out.println("Contains : "  + name.contains("Priyanka"));
      // System.out.println("Copy Value of "  + name.copy);
       System.out.println("Ends With "  + name.endsWith("l"));
       System.out.println("Ends With "  + name.endsWith("L"));
       System.out.println("Length "  + name.length());
       System.out.println("Index of  "  + name.indexOf('a'));
       System.out.println("Index of again "  + name.indexOf("wal"));
       System.out.println("Last Index of  "  + name.lastIndexOf('a'));
       System.out.println("Replace " + name.replace('a', 'p'));
       System.out.println("Replace All " + name.replaceAll("pri", "se"));
       System.out.println("Replace All " + name.replaceAll("Pri", "se"));
       System.out.println("SunString " + name.substring(4));
       String Str;
       Str = ("");
       System.out.println("SunString " + Str);

    }
}
