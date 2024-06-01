package Array_harder;

public class Reverse {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        int[][] sequence = new  int[rows][cols];
        int counter = 1;

        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence[i].length; j++) {
                sequence[i][j] = counter;
                counter++;
                System.out.println(sequence[i][j] + "\t");

            }
        }

        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence[i].length; j++) {
                System.out.println(sequence[i][j] + "\t");
            }
        }
    }
}
