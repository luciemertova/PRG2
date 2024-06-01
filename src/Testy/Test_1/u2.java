package Testy.Test_1;

import java.util.Random;

public class u2 {
    public static void main(String[] args) {

        Random random = new Random();

        int k1 = random.nextInt(6)+1;
        int k2 = random.nextInt(6)+1;
        int k3 = random.nextInt(6)+1;

        if (k1 == k2 || k1 == k3 || k2 == k3){
            System.out.println("Vyhrál jste.");
        }else {
            System.out.println("Vaše kostky nejsou stejné.");
        }

    }
}
