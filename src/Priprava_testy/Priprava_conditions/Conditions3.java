package Priprava_testy.Priprava_conditions;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Conditions3 {
    public static void main(String4[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("zadejte číslo:");
        int number = scanner.nextInt();

        if (number >= -100 && number <=-1 || number >= 1 && number <= 100){
            System.out.println("Číslo " + number + " patří do intervalu.");
        }else {
            System.out.println("Číslo " + number + " nepatří do intervalu.");
        }
    }

}
