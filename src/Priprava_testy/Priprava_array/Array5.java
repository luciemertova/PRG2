package Priprava_testy.Priprava_array;

import Priprava_testy.Priprava_strings.String4;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String4[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo: ");
        int number = sc.nextInt();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Zadejte číslo: ");
            number = sc.nextInt();
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}
