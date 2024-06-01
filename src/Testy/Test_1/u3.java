package Testy.Test_1;

import java.util.Scanner;

public class u3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik je hodin:");
        int time = sc.nextInt();

        if (time >= 6  && time <= 11){
            System.out.println("Dobré ráno.");
        } else if ( time > 11 && time < 18) {
            System.out.println("Dobré odpoledne.");
        } else if (time >= 18 && time <= 24) {
            System.out.println("Dobrý večer.");
        }else {
            System.out.println("Tento čas neexistuje.");
        }

    }
}
