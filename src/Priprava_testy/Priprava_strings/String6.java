package Priprava_testy.Priprava_strings;

public class String6 {
    public static void main(String[] args) {

       String number = "123";
       String vysledek = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            vysledek += number.charAt(i);
        }
        System.out.println(number + "->  " + vysledek);


    }
}
