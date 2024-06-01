package Methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Practise {

     static void greetings(String name){
         System.out.println("Ahoj " + name);
     }

     static int rectangleArea(int width, int height){
         return width * height;
     }

     static int random(int max, int min){
        return (int) (Math.random() * (max-min + 1) + min) ;
     }

//    vygeneruj nahodny pole cisel od min po max
//    delka pole je argument funkce
     static int[] randomArray (int lenght, int min, int max){
         int[] array = new int[lenght];
                 for(int i = 0; i < array.length; i++){
                     array[i] = random(min,max);
                 }
                 return array;
     }

//     metoda ma jako vstup pocet sekund
//     do konzole vypiste ve formatu mm:ss
//    % = zbytek po deleni 60

    static void timeConvert(int seconds){
         int minutes = seconds / 60;
         int remainingSeconds = seconds % 60;
         int hours = seconds/3600;
        System.out.println(hours + "." + minutes + ":" + remainingSeconds);
     }

    public static void main(String[] args) {
        greetings("Karel");
        greetings("Pepa");
        greetings("Franta");
        System.out.println("___________");

        int rectengleArea = rectangleArea(10,4);
        System.out.println("Area is: " + rectengleArea);
        System.out.println("___________");

        int randomNum = random(25, 40);
        int anotherRandomNum = random(30, 100);
        System.out.println(randomNum);
        System.out.println(anotherRandomNum);
        System.out.println("___________");

        System.out.println(Arrays.toString(randomArray(10,-100,100)));
        System.out.println("___________");

        timeConvert(90);
        timeConvert(180);
        timeConvert(83);
    }

}
