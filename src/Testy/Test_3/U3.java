package Testy.Test_3;

public class U3 {
    public static void main(String[] args) {

        double Sum = 0;

        int[] pole = {5, 9, 6 ,7, 6, 8, 99, 1};
        for (int i = 0; i < pole.length; i++) {
            Sum += pole[i];

        }
        System.out.println(Sum / pole.length);



    }
}
