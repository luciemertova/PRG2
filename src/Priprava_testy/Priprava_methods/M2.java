package Priprava_testy.Priprava_methods;

public class M2 {
    static int dayCount(int day, int month){
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 0; i < month-1; i++) {
            days+=months[i];
        }
        days+=day;
        return days;
    }

    public static void main(String[] args) {
        int jfj = dayCount(5, 2);
        System.out.println(jfj);
    }
}

