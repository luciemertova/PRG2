package Priprava_testy.Priprava_cycles;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Cycles3 {
    public static void main(String4[] args) {

        int number = (int)(Math.random()*100+1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte Váš tip:");
        int tip = sc.nextInt();

        while (tip != number) {
            if (tip < number) {
                System.out.println("Číslo je moc malé");
            } else if (tip > number) {
                System.out.println("Číslo je mo velké");
            }
            System.out.println("Zadejte Váš tip:");
            tip = sc.nextInt();
        }
        System.out.println("Tipnuli jste správné číslo.");



    }
}
