package Priprava_testy.Priprava_strings;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {

        String soubor = "meme";
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaky je vas typ souboru?");
        String name = sc.nextLine();
        // soubor.png, soubor.txt
        System.out.println(soubor + "." + name);

    }
}
