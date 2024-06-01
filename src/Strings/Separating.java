package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Separating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        uzivatel zada nazev pisnicky, autora, rok vydani
//        vse ulozime do jedntlivych stringu
        String input = "Dream on;|Aerosmith|;1973";
        String songName;
        String author;
        String yearOfRelease;

//        ukazka - split
        String[] splitSong = input.split(";");
        System.out.println(Arrays.toString(splitSong));
        System.out.println("__________________________________");

        songName = splitSong[0];
        author = splitSong[1];
        yearOfRelease = splitSong[2];
        System.out.println("Song " + songName + " composed by " + author + " in " + yearOfRelease);
        System.out.println("__________________________________");

        String greeting = "Hello beautiful world";
        String[] words = greeting.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("__________________________________");

//        ukazka - substring
        String word = "Hello";
        String subWord = word.substring(0, 3);
//        interval: vsechna pismena na indexu <0, 4)-+
        System.out.println(word + " -> " + subWord);
        String spanish = word.substring(1,3);
        System.out.println(spanish + " Camino");
        System.out.println("__________________________________");

//        Vezmi string ve kterem je cislo a pricti k nemu 42

        String number = "450";
        int actualNumber = Integer.parseInt(number);
        System.out.println("Number is " + actualNumber);
        System.out.println("Soucet je: " + (actualNumber + 42));
        System.out.println("__________________________________");



    }
}
