package OOP;

public class Rectangle_practise {
    public static void main(String[] args) {

        Rectangle abc = new Rectangle();

        abc.width = 4;
        abc.height = 6;
        System.out.println("Obdelnik:W = " + abc.width + " H = " + abc.height);
        System.out.println("Obsah: " + abc.getArea());
        System.out.println("Je to ctverec? " + abc.isSquare());

        Rectangle numero = new Rectangle();
        numero.width = 6;
        numero.height = 6;
        System.out.println("Obdelnik:W = " + numero.width + " H = " + numero.height);
        System.out.println("Je to ctverec? " + numero.isSquare());
    }
}
