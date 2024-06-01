package Testy.Test_2;

public class U2 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 1000; i++) {
            int nmb = (int)(Math.random()*1000+1);
            if (nmb < 100){
                count++;
                System.out.println("Cisla mensi nez 100: " + nmb);
            }

        }System.out.println("Cisel mensi nez 100 padlo: " + count);


    }
}
