package Array_harder;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPractise {
    public static void main(String[] args) {
//        ptejte se na tel císla
//        zadavani ukonci -1
//        vypiste pote vsechna tel cisla z CR dle predvolby

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        System.out.println("Zadavej tel. cisla, zadavani ukoncis zadanim -1");

//         dokud nezada -1

        while(!phoneNumber.equals("-1")){
            phoneNumber = sc.nextLine(); //Zadej dalsi string
            list.add(phoneNumber);
        }
        System.out.println("Zadano: " + list);

//        vypsat ty ceske (+420)

        String currentNumber;
        System.out.println("Ceska cisla:");
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            currentNumber = list.get(i);
            check = true;

            for (int j = 1; j < currentNumber.length(); j++) {
                char currentSymbol = currentNumber.charAt(j);

//                overit, ze se jedna o cislo 0-9

                if (!Character.isDigit(currentSymbol)){
                    check = false;
                }
            }

            if (currentNumber.startsWith("+420") && currentNumber.length() ==13 && check == true){
                System.out.println(currentNumber);
            }
        }
    }
}
