package Cycles;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        System.out.println("Zadávej cenu, ukončíš pomocí '-1'");
        int input = sc.nextInt();

        while (input != -1){
            suma += input;
            input = sc.nextInt();
        }
        System.out.println("Celková cena: " + suma);

    }
}
