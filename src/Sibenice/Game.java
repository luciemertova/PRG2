package Sibenice;

import java.util.ArrayList;

public class Game {

    String secret;
    ArrayList<String> checked;
    final String[] POOL = {"nejkulatoulinkatejsi", "papuce", "srst", "kavovar", "chirurgie"};
    Player p;
    Reader inputReader;

    public Game(Player p, Reader inputReader) {
        this.p = p;
        this.inputReader = inputReader;
    }

    //vygeneruje: nahodne slovo z poolu
    //vycisti: pocet pokusu u hrace, vsechna zadana pismena
    void setUpGame(){
        p.resetAttempts();
        checked = new ArrayList<>();
        secret = pickRandomWord();
    }

    String pickRandomWord(){
        String word;
        int randomIndex = (int)(Math.random() * POOL.length);
        System.out.println("CHEAT: " + POOL[randomIndex]);
        return POOL[randomIndex];
    }

    void makeAGuess(){
        System.out.println("Pokusu zbyva: " + p.attempts);
        System.out.println("Zadej pismeno k uhadnuti : ");
        String guess = inputReader.readInput();
        if (secret.contains(guess)){
            System.out.println("Pismeno uhadnuto!");
            checked.add(guess);
        }
        System.out.println("Nespravna volba:(");
    }


    void startGame(){
        System.out.println("Spustit hru?");
        if (inputReader.readInput().equals("y")){
            setUpGame();
            System.out.println("Hra zacala");
            while(p.attempts > 0 && checked.size() < secret.length()){
                makeAGuess();
            }
        }
        System.out.println("Hra ukoncena");
    }

}

//
