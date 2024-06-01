package Priprava_testy.Priprava_cycles;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Cycles5 {
    public static void main(String4[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo:");
        int size = sc.nextInt();

        int counter = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
            System.out.println();
        }
    }
}
