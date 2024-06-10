package Testy.Konstrukce;

public class User {
    String name;
    String adresa;

    public User(String name, String adresa) {
        this.name = name;
        this.adresa = adresa;
    }
    public String toString(){
        return (name + adresa);

    }
}
