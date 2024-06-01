package Priprava_testy.Priprava_recursion;

public class CRT {
    double totalPrice;
    int discount;

    public void Discount(int discount){
        if (!(discount >= 0 || discount <= 99)){
            System.out.println("Sleva musí být mezi 0% a 99%");
        }else{
            this.discount = discount;
        }
    }

    public void add(int itemPrice){
        totalPrice+=itemPrice;
    }

    public void remove(int itemPrice){
        if (totalPrice >= itemPrice){
            totalPrice-=itemPrice;
        } else if (totalPrice < itemPrice){
            System.out.println("Cena produktu je větší než celková cena");
        }
    }

         public double getPrice(){
            double priceWithDiscount = totalPrice * (discount*100);
            double totalPriceDPH = priceWithDiscount * 1.21;
            return totalPriceDPH;

    }




}
