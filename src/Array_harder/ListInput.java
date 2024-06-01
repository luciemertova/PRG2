package Array_harder;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Zadavej cisla, zadavani ukoncis -1");
        int input = sc.nextInt();

        while (input != -1){
            numbers.add(input);
            input = sc.nextInt();
        }
        System.out.println("Zadano");
        System.out.println(numbers);

    }
}
