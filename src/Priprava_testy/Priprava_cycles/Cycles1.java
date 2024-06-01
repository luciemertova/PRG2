package Priprava_testy.Priprava_cycles;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Cycles1 {
    public static void main(String4[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadávejte celá čísla, dokud nenapíšete -1 budu sbírat čísla...");
        int a = scanner.nextInt();
        int sum = 0;

        while (a != -1) {
            System.out.println("Zadejte další číslo: ");
            a = scanner.nextInt();
            sum += a;
        }
        System.out.println("Soucet všech zadaných čísel je: " + sum);
    }
}