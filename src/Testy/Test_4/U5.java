package Testy.Test_4;

import java.util.Scanner;

public class U5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadej telefonní číslo i s předvolbou bez mezer:");
            String rc = sc.nextLine();


            if (rc.charAt(0) == '+') {
                System.out.println("Tel. c. ma + na spravne pozici");
            }else{
                System.out.println("Tel. c. nema + na spravné pozici");
            }
            if (rc.charAt(1) == 420 ){
                System.out.println("Tel. c. ma spravnou predvolbu");
            }else {
                System.out.println("Tel. c. nema spravnou predvolbu");
            }
            if (rc.length() == 12) {
                System.out.println("Tel. c. ma spravnou delku");
            }else {
                System.out.println("Tel. c. nemá správnou delku");
            }


        }
    }

