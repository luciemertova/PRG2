package Testy.Test_2;

import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Zadávejte celá čísla, dokud nenapíšete -1 budu sbírat čísla...");
        int number = scanner.nextInt();

        while (number != -1){
            System.out.println("Zadejte další číslo: ");
            number = scanner.nextInt();
        }

            System.out.println("největší číslo je: ");


    }
}
