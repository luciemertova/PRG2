package Array;

public class ArraysTasks  {
    public static void main(String[] args) {
    // mějte pole celych cisel, reknete, kolikrat je v nem cislo mensi nez 1

        int counter = 0;
        int[] array = {-3, -25, 21, -44, 59};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1){
                System.out.println(array[i]);
                counter++;
            }
        }
        System.out.println("pocet cisel mensi nez 1: " + counter);
        System.out.println("______________________________________");

    //  vypiste pole pozpatku

        int[] yarra = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = yarra.length - 1; i >= 0; i--) {
            System.out.println(yarra[i] + " ");
        }
        System.out.println("______________________________________");
    // vypoctete soucet vsech prvku v poli

        int[] sum = {1, 2, 3, 4, 5, 6};
        int totalSum = 0;
        for (int i = 0; i < sum.length; i++) {
            // totalSum = totalSum + sum[i];
            totalSum += sum[i];
            System.out.println(totalSum);
        }
        System.out.println("______________________________________");
    //  vypsat pole cikcak

        int[] zigzag = {1, 2, 3, 4, 5, 6};
        for (int i = 0, j = zigzag.length - 1;i < zigzag.length/2; i++, j--) {
    //  prvni zpusob
            System.out.println(zigzag[i]);
            System.out.println(zigzag[j]);
        }
        System.out.println("______________________________________");
    //  druhy zpusob
        for (int i = 0; i < zigzag.length - i - 1; i++) {
            System.out.println(zigzag[i]);
            System.out.println(zigzag[zigzag.length - i - 1]);
        }

    }
}
