package Testy.Test_8_konstrukce;

public class Mail {
    User odesilatel;
    User prijemce;
    String date;
    Server ipadd;
    Server nazev;

    public Mail(User odesilatel, User prijemce, String date, Server ipadd, Server nazev) {
        this.odesilatel = odesilatel;
        this.prijemce = prijemce;
        this.date = date;
        this.ipadd = ipadd;
        this.nazev = nazev;
    }

    void sendMail(String text){
        System.out.println(odesilatel.toString() + " posila zpravu pro " + prijemce.toString() );
        System.out.println(text);
        System.out.println("Odeslano: " + date);

    }
    void printServerInfo(){
        System.out.println("Posilani zajistuje server " + nazev +  " na adrese " + ipadd );
    }
}
