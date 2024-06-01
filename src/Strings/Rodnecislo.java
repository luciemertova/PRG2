package Strings;

import java.util.Scanner;

public class Rodnecislo {
    public static void main(String[] args) {
//        uzivatel zada rodne cislo +  zjisti zda je spravne + zjisti zda je to muz nebo zena
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rodne cislo");
        String rc = sc.nextLine();
//        je spravne lomitko
//        a zaroven 123456/7897
        if (rc.charAt(6) == '/') {
            System.out.println("RC ma / na spravne pozici");
        }else{
            System.out.println("RC nema / na spravné pozici");
        }
        if (rc.length() == 11) {
            System.out.println("RC ma spravnou delku");
        }else {
            System.out.println("RC nemá správnou delku");
        }
        if (rc.charAt(2) == '0' || rc.charAt(2) == '1') {
            System.out.println("Jedna se o muze");
        } else if (rc.charAt(2) == '5' || rc.charAt(2) == '6') {
            System.out.println("Jedna se o zenu");
        }
    }
}