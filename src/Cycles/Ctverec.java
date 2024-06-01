package Cycles;

import java.util.Scanner;

public class Ctverec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
            if (i % 3 == 0){
                System.out.println();
            }
        }

    }
}
