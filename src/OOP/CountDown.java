package OOP;

import java.io.File;

public class CountDown {

    static void countDown(int n){
        if (n <= 1){
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }

    static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static void tree(String file){
        File[] files = new File(file).listFiles();
        for (File f : files){
            if (f.isFile()){
                System.out.println("Soubor: " + f.getName());
            }else {
                System.out.println("Složka: " + f.getName());
                tree(f.getPath());
            }
        }
    }


    public static void main(String[] args) {
        countDown(5);
    }


}
