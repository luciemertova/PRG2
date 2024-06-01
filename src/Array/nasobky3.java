package Array;

import java.util.Arrays;

public class nasobky3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = 1;
        int max = 10 ;


        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }System.out.print(Arrays.toString(array));

    }
}
