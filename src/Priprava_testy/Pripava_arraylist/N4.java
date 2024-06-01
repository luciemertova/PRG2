package Priprava_testy.Pripava_arraylist;

import java.util.ArrayList;

public class N4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 50) {
                list.remove(i);
                i--;
                count++;
            }
        }

                System.out.println(list);
                System.out.println("Bylo odstraneno " + count + " cisel");
    }
}
