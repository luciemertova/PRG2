package Uvod;

import java.util.Scanner;

public class conditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte číslo: ");
        int number = scanner.nextInt();
        System.out.println("Zadal jsi číslo: " + number);


        if (number % 5 == 0){
            System.out.println("Číslo je dělitelné 5.");
        } else {
            System.out.println("Číslo není dělitelné 5.");
        }

        System.out.println("Zadej rok:");
        int year = scanner.nextInt();
        if (year % 4 == 0){{
            System.out.println("rok " + year + " je přestupný.");}
        } else{
            System.out.println("rok " + year + " není přestupný.");
        }

// interval 5 - 15
        System.out.println("Zadej číslo: ");
        int interval = scanner.nextInt();
        if (interval >= 5 && interval <= 15) {
            System.out.println("Číslo" + interval + " leží v intervalu");
        } else {
            System.out.println("Číslo" + interval + " neleží v intervalu");
        }

        System.out.println("zadejte počet bodů:");
        int points = scanner.nextInt();
        if (points >= 90){
            System.out.println("Známka je 1");
        }else if (points >= 80){
            System.out.println("");
        }
    }
}
