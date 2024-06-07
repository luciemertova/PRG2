package Sibenice;

import java.util.ArrayList;

public class Game {

    String secret;
    ArrayList<String> checked;
    final String[] POOL = {"strom", "inovace", "figurka", "kavovar", "infis"};
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

    void printState(){
        StringBuilder state = new StringBuilder();
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            if (checked.contains(String.valueOf(s))) {
                state.append(s); // přidá uhádnuté písmeno do řetězce
            } else {
                state.append(" _ "); // přidá podtržítko, pokud písmeno ještě nebylo uhádnuto
            }
        }
        System.out.println(state.toString()); // vypíše aktuální stav hádání slova

    }

    void makeAGuess(){
        System.out.println("Pokusu zbyva: " + p.attempts);
        System.out.println("Zadej pismeno k uhadnuti : ");
        String guess = inputReader.readInput();
        if (secret.contains(guess)){
            System.out.println("Pismeno uhadnuto!");
            checked.add(guess);

        }else {
            p.attempts--;
            System.out.println("Nespravna volba:" + guess);
        }

    }


    void startGame(){
        System.out.println("Spustit hru?");
        if (inputReader.readInput().equals("y")){
            setUpGame();
            System.out.println("Hra zacala");
            while(p.attempts > 0 && checked.size() < secret.length()){
                makeAGuess();
                printState();
            }
        }
        System.out.println("Hra ukoncena");
    }

}


