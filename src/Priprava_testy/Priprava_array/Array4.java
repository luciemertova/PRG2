package Priprava_testy.Priprava_array;

import Priprava_testy.Priprava_strings.String4;

import java.util.Scanner;

public class Array4 {
    public static void main(String4[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cislo:");
        int number = sc.nextInt();
        int counter = 0;


        int[] arr = {1, 5, 6, 8, 6, 4, 6, 7, 13, 15, 16, 15, 15, 15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                counter++;
                System.out.println("index: "  + i);
            }
        }
        System.out.println("Vase cislo:" + number);
        System.out.println("Vyskytuje se " + counter + "x");

    }
}
