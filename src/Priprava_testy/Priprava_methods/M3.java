package Priprava_testy.Priprava_methods;

public class M3 {

    static int dayCount(int day, int month, int year){
        int yearDays = 0;
        int countDays = 0;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month -1; i++) {
            countDays += months[i];
        }
        countDays+=day;
        return countDays;
    }

    static boolean isLeapYear(int year){
            if (year % 4 ==0){
                return true;
            }return  false;
    }

    public static void main(String[] args) {
        int jfj = dayCount(5, 2, 2024);
        System.out.println(jfj);
    }
}