package Testy.Test_6;

public class PR2 {

    static double parkingPlace(int pocet, int days){
        int priceForOneDay = 150;
        int totalPrice = priceForOneDay*days;
        if (pocet > 10){
            totalPrice = (totalPrice/100)*90;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
         double total = parkingPlace(12, 6);
        System.out.println(total);
    }
}
