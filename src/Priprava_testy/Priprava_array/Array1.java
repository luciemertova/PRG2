package Priprava_testy.Priprava_array;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Array1 {
    public static void main(String4[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte délku pole: ");
        int delka = sc.nextInt();
        int[] pole = new int[delka];

        for (int i = 0; i < pole.length; i++) {
            int ran = (int)(Math.random()*100+1);
            pole[i] = ran;
            System.out.print(pole[i] + ", ");
        }
    }
}
