package Priprava_testy.Priprava_methods;

public class M1 {

    static int getMax(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nmbr = {1,2,3,4,5,6,7};
        int cislo = getMax(nmbr);
        System.out.println(cislo);

    }
}
