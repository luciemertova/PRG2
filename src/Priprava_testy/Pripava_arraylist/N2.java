package Priprava_testy.Pripava_arraylist;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {


        int soucet = 0;
        Scanner sc = new Scanner(System.in);
        int[][] pole ={
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };

        System.out.println("Zadejte cislo sloupce:");
        int sloupec = sc.nextInt();

        for (int i = 0; i < pole.length; i++) { // 1
            soucet+= pole[i][sloupec];

        }
        System.out.println("Soucet sloupce: " +  sloupec + " je " + soucet);

    }
}