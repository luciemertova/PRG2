package Priprava_testy.Pripava_arraylist;

public class N5 {
    public static void main(String[] args) {

        int[][] recenze = {
                {1, 5, 3, 2, 6}, // film jedna
                {5, 9, 7, 9, 6}, // filma dva
                {9, 9, 7, 8, 9}, // film tri
                {3, 3, 1, 1, 2}  //film ctyri
        };

            int count = 0;
            int counting = 0;

        for (int i = 0; i < recenze.length; i++) {
            double prumer = 0;
            for (int j = 0; j < recenze[i].length ; j++) {
                prumer += recenze[i][j];
            }
            prumer /= recenze[i].length;
            System.out.println(prumer);
            if (prumer > 7.5) {
                count++;
            } else if (prumer > 7) {
                counting++;
            }
        }
        System.out.println("Pocet filmu, ktere ziskali prumerne skore vetsi nez 7.5 je: " + count);
        System.out.println("Pocet filmu, ktere ziskali kladne recenze je : " + counting);



    }
}
