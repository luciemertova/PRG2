package Methods;

public class Basics {

    static void printHello(){
        System.out.println("Hello world");
        System.out.println("Called from a method!");
    }

    static void printGreeting(String name){
        System.out.println("Ahoj " + name);
    }

    private static void sum(int a, int b){
        System.out.println(a + " + " + b + " = ");
        System.out.println(a+b);
    }

    static int multiplication(int a, int b){
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        printHello();
        printGreeting("Karel");
        printGreeting("Honza");
        sum(2 ,5);
        sum(-4,20);
        multiplication(5,3); //spocita, ale nic neudela
        int multiplicationResult = multiplication(5, 3);
        System.out.println(multiplicationResult);
    }
}
