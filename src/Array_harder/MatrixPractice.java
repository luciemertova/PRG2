package Array_harder;

import javax.swing.*;

public class MatrixPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
//vygenerovani
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90 + 10);
            }
        }

        //vypsani
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                }
            System.out.println();// = odradkovani
            }

        System.out.println("Printing row:");
//uzivatel zada cislo radku, vypise radek
        String input = JOptionPane.showInputDialog("zadej cislo radku");
        int row = Integer.parseInt(input);
        for (int i = 0; i < matrix[row].length; i++) {
            System.out.print(matrix[row][i] + " ");

            }
        System.out.println();
//uzivatel zada cislo sloupce, vypise sloupec
        System.out.println("Printing column:");
        input = JOptionPane.showInputDialog("zadej cislo sloupce");
        int col = Integer.parseInt(input);
        for (int i = 0; i < matrix[row].length; i++) {
            System.out.println(matrix[i][col] + " ");

        }
        System.out.println();
        System.out.println("________");


//      vypiš průměr pole a nakonec průměry každého pole a pak prumer vsech
        int sumPartial = 0;
        int sumTotal = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumPartial = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumTotal += matrix[i][j];
                sumPartial += matrix[i][j];
            }
            System.out.println("Average of arr#" + i + ": " + ((double)sumPartial/matrix[i].length));
        }
//        funguje pouze když poet řádků = počtu sloupců
        System.out.println("Total avega = " + ((double)sumTotal / (matrix.length*matrix.length)));


        //vypis ve formatu
        // *
        // **
        // ***

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
