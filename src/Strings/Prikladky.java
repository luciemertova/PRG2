package Strings;

import java.util.Scanner;

public class Prikladky {
    public static void main(String[] args) {
//        načti sting od uzivatele
//        string je heslo
//        nheslo musi byt dlouhy aspon 8 znaku

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej mozen heslo");
        String password = sc.nextLine();
        if (password.length() < 8){
            System.out.println("neplatné heslo");
        }else {
            System.out.println(password + " je OK");
        }
        System.out.println("________________");

//        heslo musi odpovídat 'secret'
//        vypiste, zda uzivatel uhadl
        System.out.println("uhadni heslo:");
        password = sc.nextLine();
        String correctPassword = "secret";
        if (password.equals(correctPassword)){
            System.out.println("Spravne");
        }else {
            System.out.println("Spatne");
        }
        System.out.println("________________");
    }
}
