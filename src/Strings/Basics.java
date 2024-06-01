package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

//        v CHAR muzeme pouze jeden znak
        char input = 'A';
        input = '9';
        System.out.println(input + 1);
        System.out.println("_____________");

//        odradkovaní inputu
        input = '\n';
        System.out.println("Hello" + input + "World");
        System.out.println("_____________");
//        tabulator
        input = '\t';
        System.out.println("Hello" + input + "World");
        System.out.println("_____________");

//        porovnani

        char a = 'A';
        char A = 'A';
        if (A==a){
            System.out.println("They're same");
        }
        System.out.println("______________");

        String hello = "Hello!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte slovo:");
        String helko = sc.nextLine();
        System.out.println("Zadal jsi: " + helko);


        if (hello.equalsIgnoreCase(helko)){
            System.out.println("They're same");
        }
        System.out.println("______________");


        String showcase = "Obsah \t\t str\ningu\n\n\n:(";
        System.out.println(showcase);
        System.out.println("______________");
        String more = showcase + "Hello";
        System.out.println(more);
        System.out.println("______________");

//        Case sensitive
        boolean isSame = "hello".equals("HeLlo");
        String helloTest = "hello";
        helloTest.equals("Neco dalsiho"); //rovna se
        String upperHello = helloTest.toUpperCase();
//        po zavolani se puvodni nezmeni
        System.out.println(helloTest);
        System.out.println(upperHello);
        System.out.println("______________");
        System.out.println("Pismeno na 2: " + helloTest.charAt(2));
        System.out.println("______________");
        System.out.println("Kde je 'l'?" + helloTest.indexOf('l'));
        System.out.println("Kde je 'l'?" + helloTest.lastIndexOf('l'));


    }
}
