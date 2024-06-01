package Strings;

import java.sql.SQLOutput;

public class Building {
    public static void main(String[] args) {

        String greeting = "Hello";
        greeting += " world";
        System.out.println(greeting);

        String word = "something";
        String drow = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            drow += word.charAt(i);

        }
        System.out.println(word);
        System.out.println("________");
        System.out.println(drow);
        System.out.println("________");

        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder);
        System.out.println("________");
        builder.reverse();
        System.out.println(builder);
        System.out.println("________");

        builder.insert(2,"SECRET");
        System.out.println(builder);
        System.out.println("________");

        builder.append(" World!");
        System.out.println(builder);
        System.out.println("________");

        System.out.println(builder.indexOf("E"));

        System.out.println(builder.lastIndexOf("E"));
        System.out.println("________");
        if (builder.lastIndexOf("q") == builder.indexOf("q") && builder.indexOf("q") > -1){
            System.out.println("je prave jedno");
        }else if (builder.indexOf("q") == -1){
            System.out.println("neni vubec");
        }else {
            System.out.println("je vickrat");
        }


    }

}
