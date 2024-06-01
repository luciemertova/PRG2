package Priprava_testy.Pripava_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {

        ArrayList<String> spanishNames = new ArrayList<>();

        System.out.println("Zadavejte spanelska podstatna jmena, zadavani ukoncite frazi 'fin'");
        Scanner sc = new Scanner(System.in);
        String spanish = sc.nextLine();

        while (!spanish.equalsIgnoreCase("fin")){
            spanish = sc.nextLine();
            spanishNames.add(spanish);
        }
        for (int i = 0; i < spanishNames.size(); i++) {
            if (!(spanishNames.get(i).startsWith("el") || spanishNames.get(i).startsWith("la") || spanishNames.get(i).startsWith("un"))){
                spanishNames.remove(i);
                i--;
            }
        }
        System.out.println(spanishNames);

    }
}
