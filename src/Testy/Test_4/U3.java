package Testy.Test_4;

public class U3 {
    public static void main(String[] args) {

        String words = "Dnes jsem šel nakupovat a koupil jsem si nanuka. Dneska jsme dostali 7 přikladu, ktery se nedaji stihnout.";
        int count = 0;
        String[] splitWord = words.split(".");
        count = splitWord.length;
        System.out.println("Pocet vet: " + count );

    }
}
