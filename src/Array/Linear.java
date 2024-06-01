package Array;

public class Linear {
    public static void main(String[] args) {
//        linearni rovnice

        double[] points = {-2, -1, 0, 1, 2};
        for (int i = 0; i < points.length; i++) {
            System.out.println("body:");
            System.out.println("x = " + points[i]);
            double y = 2*points[i] + 5;
            System.out.println("y = " + y);
        }
        System.out.println("_______");




    }
}
