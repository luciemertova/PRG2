package Testy.Test_5;

import javax.swing.*;

public class U2 {
    public static void main(String[] args) {

        int[][] array = {
                {15, 3, 4, 22},
                {18, 33, 8, 2},
                {19, 1, 75, 8},
                {15, 152, 4, 12},
        };


        String input = JOptionPane.showInputDialog("zadej cislo radku");
        int row = Integer.parseInt(input);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] > max) {
                max = array[row][i];
            }
            System.out.print(array[row][i] + " ");
        }
        System.out.println("\nMaximalni hodnota v radku " + row + " je: " + max);
    }
}
