package Priprava_testy.Priprava_methods;

public class M5 {

    static boolean isTriangle(int a, int b, int c){

        if (a + b > c && b + c > a && a + c > b) {
            return true; // Trojúhelník lze sestavit
        } else {
            return false; // Trojúhelník nelze sestavit
        }
    }

    static double triangleArea(int a, int b, int c){
        if (isTriangle(a,b,c)){
            double s = (a + b + c) / 2.0;
            double obsah = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return obsah;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(4,4,4));
        System.out.println(triangleArea(4,4,4));

    }
}
