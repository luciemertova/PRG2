package OOP;

public class Mocnina {
    static int notRecursive(int root, int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            result+=root;
        }
        return result;
    }

    static int recursive(int root, int power){
        if (power == 1){
            return root; // jednoduche reseni
        }
//        jina reseni
        return recursive(root, power -1)*root;
    }

    public static void main(String[] args) {
        System.out.println(notRecursive(5,6));
        System.out.println(recursive(2,6));
    }
}
