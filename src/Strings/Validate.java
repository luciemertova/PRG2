package Strings;

import javax.swing.*;
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        boolean ok = true;

        String input = JOptionPane.showInputDialog("zadej IP");
        System.out.println("zadal jsi: " + input);

//        spočítat tečky
        String[] parts = input.split("\\.");
        if (parts.length == 4){
            System.out.println("Délka je OK");
        }
        System.out.println("_______________________");

//        kontrola, ze tam vubec cisla jsou
        for (int i = 0; i < parts.length && ok; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                char current = parts[i].charAt(j);
                if (Character.isDigit(current)){
                    System.out.println(current + " ..... je cislo");
                }else {
                    System.out.println("Neni format [0-255].[0-255].[0-255].[0-255]!");
                    ok = false;
                    break;
                }
            }

        }
        System.out.println("_______________________");

//          ověřit zda jsou čísla OK
        for (int i = 0; i < parts.length && ok; i++) {
            int number = Integer.parseInt(parts[i]);
            if (number >= 0 && number <= 255){
                System.out.println((i+1) + "/" + parts.length + " OK");
            }else {
                System.out.println("Cisla nejsou v intervalu IP adresy");
                ok = false;
                break;
            }

        }
        System.out.println("_______________________");
        if (ok) {
            System.out.println("Zadal jsi IP adresu");
        }else {
            System.out.println("Nebyla zadana IP adresa");
        }

    }
}
