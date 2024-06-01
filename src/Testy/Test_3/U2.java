package Testy.Test_3;

public class U2 {
    public static void main(String[] args) {

        int[] pole = {16, 15, 1, 19, 16, 13, 22, 6, 12, 18};
        int count = 0;

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] >= 10 && pole[i]<=20){
                count++;
                System.out.println(pole[i]);
            }

        }System.out.println("Pocet cisel v intervalu <10,20>: " + count);

    }
}
