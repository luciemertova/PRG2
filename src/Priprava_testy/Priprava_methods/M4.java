package Priprava_testy.Priprava_methods;

public class M4 {

    static void textAnalysis(String text){
        int wordsInText = 0;
        int numberOfSentences = 0;
        wordsInText = text.split(" ").length;
        numberOfSentences = text.split("\\.").length;
        System.out.println(wordsInText);
        System.out.println(numberOfSentences);
    }

    public static void main(String[] args) {

        String words = "Dnes jsem šel nakupovat a koupil jsem si nanuka. Šel do krámu pro nankuka.";
        textAnalysis(words);

    }
}
