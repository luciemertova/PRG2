package Array;

public class Posledni {
    public static void main(String[] args) {

        int[] switches = {15, 2, 9};



        int[] pole = {12, 15, 16, 18, 17, 144, -2};

        for (int i = 0; i < pole.length - 1; i++) {
            if (pole[i] > pole[i+1]){
                System.out.println("Neni serazeno");
                break;
            }

        }

    }
}
