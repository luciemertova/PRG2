package Testy.Test_1;

import java.util.Scanner;

public class u1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Váš věk:");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("Krev darova nemůžete, je Vám méňě než 18 let.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("Krev darovat můžete.");
        } else{
            System.out.println("Krev darovat nemůžete.");
        }

    }
}
