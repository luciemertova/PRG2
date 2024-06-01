package Priprava_testy.Priprava_cycles;

import Priprava_testy.Priprava_strings.String4;

public class Cycles4 {
    public static void main(String4[] args) {

        int count = 0;

        for (int i = 0; i < 100000 ; i++) {
            int number = (int)(Math.random()*100+1);
            if (number == 42){
                count++;
            }

        }
        System.out.println("Číslo 42 padlo: " + count + " krát");
    }
}
