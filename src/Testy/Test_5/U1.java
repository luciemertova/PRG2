package Testy.Test_5;

public class U1 {
    public static void main(String[] args) {
        int[][] zaci = {
                {20, 45, 50},
                {12, 43, 40},
                {30, 22, 46},
                {28, 42, 50},
        };

            int count = 0;

        for (int i = 0; i < zaci.length; i++) {
            int body = 0;
            for (int j = 0; j < zaci[i].length; j++) {
                body += zaci[i][j];
            }
            System.out.println(body);
            if (body >= 100){
                count++;
            }
        }
        System.out.println("Prošlo " + count + " zaku.");


    }
}
