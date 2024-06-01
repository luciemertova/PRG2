package Priprava_testy.Priprava_methods;

public class M6 {

    static int digitsSum(int number){
        int sum = 0;
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            sum+= Character.getNumericValue(String.valueOf(number).charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = digitsSum(564);
        System.out.println(sum);
    }
}
