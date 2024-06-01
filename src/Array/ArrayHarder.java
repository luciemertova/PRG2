package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHarder {
    public static void main(String[] args) {


        int numbers = 5;
        int tries = 6;
        int min= 5;
        int max = 20;

        int[] GuessArray = new int[5];
        for (int i = 0; i < GuessArray.length; i++) {
            GuessArray[i] = (int)(Math.random()*(max-min + 1) + min);
        }
//        System.out.println(Arrays.toString(GuessArray));
        int score = 0;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Zadejte cislo");
            input = sc.nextInt();
            for (int j = 0; j < GuessArray.length; j++) {
                if (GuessArray[j] == input){
                    score += 20;
                    System.out.println("Cislo nalezeno, +20 bodu");
                    GuessArray[j] = -1;
//                    System.out.println(Arrays.toString(GuessArray));
                }
            }
            if (score == 100){
                System.out.println("Uhadl jsi vse!");
                break;
            }
        }
        System.out.println("Hra ukoncena");
        System.out.println("Ziskal jsi " +  score + " bodu");
        System.out.println(Arrays.toString(GuessArray));

    }

}
