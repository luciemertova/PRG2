package Priprava_testy.Priprava_array;

import Priprava_testy.Priprava_strings.String4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_harder {
    public static void main(String4[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Zadejte číslo: ");
            int number = sc.nextInt();
            if (number >= 10 && number <= 100){
                array[i] = number;
            }else{
                System.out.println("Cislo muze by pouze 10 - 100");
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}