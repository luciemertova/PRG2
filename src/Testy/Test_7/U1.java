package Testy.Test_7;

public class U1 {
    double totalPrice;
    int discount;

    public U1(double totalPrice, int discount) {
        this.totalPrice = totalPrice;
        this.discount = discount;
    }

    public void setDiscount(int discount){
        if (discount > 99 || discount < 0){
            System.out.println("Sleva musí být v rozmezí od 0% do 99%");
        }else {
            this.discount = discount;
        }
    }

    public void add(int itemPrice){
        totalPrice += itemPrice;
    }
    public void remove(int itemPrice){
        if (totalPrice >= itemPrice){
            totalPrice-=itemPrice;
        }else if (totalPrice<itemPrice){
            System.out.println("Cena produktu je moc velká");
        }
    }

    public double getPrice(){
        double discountPrice = totalPrice * (discount*0.01);
        double dphPrice = discountPrice * 1.21;
        return dphPrice;
    }


}
