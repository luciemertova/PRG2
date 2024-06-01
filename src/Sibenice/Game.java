package Sibenice;

import java.util.ArrayList;

public class Game {

    String secret;
    ArrayList<String> checked;
    final String[] POOL = {"nejkulatoulinkatejsi", "papuce", "srst", "kavovar", "chirurgie"};
    Player p;
    Reader input;

    public Game(Player p, Reader input) {
        this.p = p;
        this.input = input;
    }

    //vygeneruje: nahodne slovo z poolu
    //vycisti: pocet pokusu u hrace, vsechna zadana pismena
    void setUpGame(){
        p.resetAttempts();
        checked = new ArrayList<>();
    }

    String pickRandomWord(){
        String word;
        int randomIndex = (int)(Math.random() * POOL.length);
        System.out.println("CHEAT: " + POOL[randomIndex]);
        return POOL[randomIndex];
    }

}
