package Testy.Test_4;

import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej mozen heslo");
        String password = sc.nextLine();


        if (password.length() < 8) {
            System.out.println("neplatné heslo");
        }else {
            System.out.println("Délka hesla je OK");
        }
        if (password.charAt(0) == 'H') {
            System.out.println( "Heslo obsahuje H");
        }else {
            System.out.println("Heslo neobsahuje H");
        }
        if (password.contains("*")){
            System.out.println("Heslo obsahuje *");
        }else {
            System.out.println("Heslo neobsahuje *");
        }
    }
}
