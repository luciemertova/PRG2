package Priprava_testy.Priprava_strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        String[] users = {"čokoláda", "prd", "prcek", "josífek", "prdelka"};
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej uzivatelske jmeno:");
        String userName = sc.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i])){
                System.out.println("uzivatelske jmeno " + userName + " se zde nachazi");
                break;
            }
        }

    }
}
