package Strings;

import java.util.Scanner;

public class Array_String {
    public static void main(String[] args) {
//        pole stringu:
        Scanner sc = new Scanner(System.in);
        String[] passwords = {"ananas", "vodka", "rohlik"};
        System.out.println("Zkus uhadnout heslo");
        String guess = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (guess.equals(passwords[i])){
                System.out.println("Uhadl");
                break;
            }
        }
        System.out.println("_____________");

        String[] names = {"Ctirad Novák", "Oldřich Starý", "Jan Franta", "Jan Boháč", "František Král"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ") ){
                System.out.println(names[i]);
            }

        }
    }
}
