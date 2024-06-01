package Priprava_testy.Priprava_strings;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte slovo:");
        String srck = sc.nextLine();
        boolean contains = false;


        for (int i = 0; i < srck.length()-1; i++) {
            if(srck.charAt(i) == srck.charAt(i+1)){
                contains = true;
                break;
            }
        }

        if (contains){
            System.out.println(srck + "-> ano");
        } else {
            System.out.println(srck + "-> ne");
        }

    }
}
