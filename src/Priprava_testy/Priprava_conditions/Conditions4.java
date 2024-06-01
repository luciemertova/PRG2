package Priprava_testy.Priprava_conditions;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Conditions4 {
    public static void main(String4[] args) {

        int price = 200;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte Váš věk:");
        int age = scanner.nextInt();

        if (age >= 1 && age <= 12 || age > 70){
            System.out.println("Vaše sleva je 40%, cena vašeho lístku bude: " + (price * 0.6));
        } else if (age >= 13 && age <= 18) {
            System.out.println("Vaše sleva je 20%, cena vašeho lístku bude: " + (price * 0.8));
        }else{
            System.out.println("Cena Vašeho lístku je " + price);
        }
    }
}
