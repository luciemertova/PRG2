package Testy.Test_5;

import java.util.ArrayList;
import java.util.Scanner;

public class U3 {
    public static void main(String[] args) {

        ArrayList<String> password = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadavej hesla, zadavani ukoncis zadanim 'konec'");
        String heslo = sc.nextLine();

            if (heslo.length() >= 8 && heslo.contains("*")){
                password.add(heslo);
                while (!heslo.equals("konec")) {
                    heslo = sc.nextLine();

        }
            }
        System.out.println(password);

    }

}
