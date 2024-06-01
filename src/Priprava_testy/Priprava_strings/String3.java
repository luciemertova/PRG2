package Priprava_testy.Priprava_strings;

public class String3 {
    public static void main(String[] args) {

        String  oppositeCase = "rsdekoefhfnvjhgoejfokejkfjdkfjkdjfkdjfdjfkdfkdjfdfjjurjhj";
        String vysledek ="";
        for (int i = 0; i <  oppositeCase.length(); i++) {
            if (i % 2 == 0){
                vysledek += Character.toLowerCase(oppositeCase.charAt(i));
            }else{
                vysledek += Character.toUpperCase(oppositeCase.charAt(i));
            }
        }
        System.out.println(vysledek);

    }
}
