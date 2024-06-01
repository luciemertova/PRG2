package Testy.Test_3;

public class U1 {
    public static void main(String[] args) {

        int min= -100;
        int max = 100;
        int Sum = 0;
        int Sum2 = 0;
        int totalSum = 0;

        int[] pole = new int[10];
        int[] pole2 = new int[10];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int)(Math.random()*(max-min + 1) + min);
            Sum += pole[i];

        }
        for (int j = 0; j < pole2.length; j++) {
            pole[j] = (int)(Math.random()*(max-min + 1) + min);
            Sum2+= pole2[j];
        }
        totalSum = Sum + Sum2;
        if (totalSum > 0){
            System.out.println("Positive sum");
            System.out.println(totalSum);
        }else{
            System.out.println(totalSum);
        }

    }
}
