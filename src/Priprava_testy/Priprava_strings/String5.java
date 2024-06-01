package Priprava_testy.Priprava_strings;

public class String5 {
    public static void main(String[] args) {

        String[] names = {"Pepis", "Karel", "František Dlouhojmenný", "Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso" ,"Eva" };
        String longestName = names[0];
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longestName.length()){
                longestName = names[i];
            }

        }
        System.out.println("Nejdelsi jmeno je:  " + longestName);


    }
}
