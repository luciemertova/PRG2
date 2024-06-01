package Testy.Test_2;

public class U3 {
    public static void main(String[] args) {

        int c1 = (int)(Math.random()*20+1);
        int c2 = (int)(Math.random()*20+1);
        int c3 = (int)(Math.random()*20+1);
        int count = 0;

        while (c1 != 20 && c2 !=20 || c1 != 20 && c3 !=20 || c3 != 20 && c2 !=20){
            count++;
            c1 = (int)(Math.random()*20+1);
            c2 = (int)(Math.random()*20+1);
            c3 = (int)(Math.random()*20+1);

        }
        System.out.println("Zabralo to: " + count + " pokusu.");

    }
}
