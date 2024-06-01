package Priprava_testy.Priprava_array;

import Priprava_testy.Priprava_strings.String4;

import java.util.Arrays;

public class Array3 {
    public static void main(String4[] args) {

        int[]arr1 = {4, 9, 36, 100, 400};
        int[]vysledek = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            vysledek[i] = (int)(Math.sqrt(arr1[i]));
        }
        System.out.println(Arrays.toString(vysledek));

    }
}
