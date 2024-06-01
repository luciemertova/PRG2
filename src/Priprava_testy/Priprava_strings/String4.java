package Priprava_testy.Priprava_strings;

public class String4 {
    public static void main(String[] args) {

        String words = "Dnes jsem šel nakupovat a koupil jsem si nanuka";
        int count = 0;
        String[] splitWord = words.split(" ");
        count = splitWord.length;
        System.out.println("Ve vete se nachazi " + count + " slov.");


    }
}
