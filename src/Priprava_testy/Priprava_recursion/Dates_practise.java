package Priprava_testy.Priprava_recursion;

public class Dates_practise {
    public static void main(String[] args) {
        Dates d = new Dates(9,4,2024);
//        d.day = 9;
//        d.month = 4;
//        d.year = 2024;

        d.printDDMM();
        d.printDDMMYY();
        d.isLeapYear();
    }

}
