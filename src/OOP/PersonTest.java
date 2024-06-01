package OOP;

public class PersonTest {

    public static void main(String[] args) {

        Osoba person = new Osoba();
        person.age = 17;
        person.name = "Peťulka";
        person.shoeSize = 41;
        person.intro();

        Osoba anotherPerson = new Osoba();
        anotherPerson.age = 16;
        anotherPerson.name = "Josífek";
        anotherPerson.shoeSize = 43;
        anotherPerson.intro();

    }
}
