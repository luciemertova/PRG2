package Array_harder;

import java.util.ArrayList;

public class Listing {
    public static void main(String[] args) {


//        ArrayList<Double>
//        ArrayList<Character>

//        vytvoření
        ArrayList<Integer> bigArray = new ArrayList<>();

//        ukládaní - př. 20 náhodných prvků

        bigArray.add(10); // na prvni volne misto
        bigArray.add(1,20); // na index 1

        for (int i = 0; i < 20; i++) {
            bigArray.add(i + 1);
        }
//        vypis, varianta 1
        System.out.println(bigArray);

//        vypis, varianta 2
//        System.out.println(bigArray.get(5));
//
////        ziskani velikosti pole
//        for (int i = 0; i < bigArray.size(); i++) {
//            System.out.println(bigArray.get(i));
//        }

//        otazka: obsahuje prkvy?

    }
}
