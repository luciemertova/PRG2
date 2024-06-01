package Priprava_testy.Pripava_arraylist;

import java.util.ArrayList;

public class N1 {
    public static void main(String[] args) {


        ArrayList<Integer> cisla = new ArrayList<>();
        cisla.add(1);
        cisla.add(2);
        cisla.add(3);
        cisla.add(4);
        cisla.add(5);
        cisla.add(6);

        for (int i = 0; i < 10; i++) {
            cisla.add(i+1);

        }

        for (int i = cisla.size() - 1; i >= 0 ; i--) {
            System.out.println(cisla.get(i));
        }




    }
}
