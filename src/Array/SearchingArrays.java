package Array;

import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {

        int[] arr = {456, 32, -21, 11, -157, 871, 654, 1};
        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

//        maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("______________________");

//        minimum
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("______________________");

//        serazeni pole vzestupne

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("______________________");

//        fillArray - napln pole od uzivatele
//        int[] emptyArray = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < emptyArray.length; i++) {
//            System.out.println("Zadej cislo:");
//            emptyArray[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(emptyArray));
        System.out.println("______________________");

//        fillArray - napln pole od uzivatele
//        int[] emptyArray = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < emptyArray.length; i++) {
//            System.out.println("Zadej cislo:");
//            emptyArray[i] = sc.nextInt();
//            if (emptyArray[i] > 10) {
//                System.out.println("Cislo musi byt mensi nez 10");
//                for (i = 0; i < emptyArray.length; i++) {
//                    System.out.println("Zadej cislo:");
//                    emptyArray[i] = sc.nextInt();
//                }
//                System.out.println(Arrays.toString(emptyArray));
//                System.out.println("______________________");
//            }
//        }
    }
}
