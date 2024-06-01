package Priprava_testy.Priprava_cycles;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Cycles2 {
    public static void main(String4[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte celé číslo:");
        int fac = sc.nextInt();
        int answer = 1;

        for (int i = fac; i > 0 ; i--) {
            answer *= i;

        }
        System.out.println("Faktoriál čísla " + fac + "! = " + answer);
    }
}
