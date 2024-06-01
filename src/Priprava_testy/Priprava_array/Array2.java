package Priprava_testy.Priprava_array;

import Priprava_testy.Priprava_strings.String4;

public class Array2 {
    public static void main(String4[] args) {

        int[] arr = {15, 21 , 46, 785, 333, 65, 14, 2, 1, 8};
        int soucetl = 0;
        int soucets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                soucetl += arr[i];
            }else{
                soucets += arr[i];
            }
        }System.out.println("Soucet lichych cisel: " + soucetl);
         System.out.println("Soucet sudych cisel: " + soucets);

    }
}
