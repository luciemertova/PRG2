package Array;

public class DoubleArray {
    public static void main(String[] args) {

        double[] doubleArray ={15.6, 123.8, 657.4, 2.5, 57.7, -1, 0, -528};
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        System.out.println("______");

        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < 0){
                System.out.println(doubleArray[i]);
            }
        }

        System.out.println("______");
        //suma pole
        double arraySum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            arraySum += doubleArray[i];
        }
        System.out.println("Sum of array: " +  arraySum);
        System.out.println("______");
    }
}
