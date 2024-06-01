package OOP_references;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BlackJack_game {
     BlackJack_player player;
     int dealerValue;
     int bet;

    public BlackJack_game(BlackJack_player player) {
        this.player = player;
        this.dealerValue = (int) (Math.random() * 11 + 10);
    }

        boolean takeTurn(){
            System.out.println("Liznout dalsi kartu?");
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equalsIgnoreCase("ano")){
                return true;
            }else {
                return false;
            }
        }
    void printInfo(){
        System.out.println("===================");
        System.out.println("Hrac:\t" + player.getHandValue());
        System.out.println("Dealer:\t" +  dealerValue);
        System.out.println("===================");
    }

    void start(){
        while (wantToPlay()){
            player.handValue =0;
            dealerValue = (int)(Math.random() * 11 + 10);
            bet = 2 * betAmount();
            System.out.println("Hra zacala a vsazena je castka " + bet);
            System.out.println("CHEAT: dealer ma " + dealerValue);
            player.pickCard();

            while(takeTurn() && player.getHandValue() < 21){
                player.pickCard();
                System.out.println("V ruce mas: " + player.getHandValue());
            }

            if (player.getHandValue() == 21){
                System.out.println("Hrac " +  player.name + " vyhral " + bet );
                player.money += bet;
            }else if (player.getHandValue() == dealerValue){
                player.money += bet/2;
                System.out.println("hra dopadla remizou");
            }else if (player.getHandValue() > 21){
                System.out.println("Hrac " + player.name + " prohrava");
            } else if (21 - player.getHandValue() > 21 - dealerValue) {
                System.out.println("Hrac " + player.name + " prohrava");
            }else {
                System.out.println("Hrac " +  player.name + " vyhral " + bet );
                player.money += bet;
            }
            System.out.println("Hra ukoncena");
            System.out.println("Kolo ukonceno na ucte ma hrac " + player.name + "  " + player.money);
        }

    }

    int betAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik se vsazi");
        int amount = sc.nextInt();

        while (!(amount > 0 && amount <= player.money)){
            System.out.println("Neplatna hodnota, zadej znovu");
            amount = sc.nextInt();
        }
        player.money -= amount;
        return amount;
    }

    boolean wantToPlay(){
        System.out.println("Chcete hrat?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("ano")){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        BlackJack_player james = new BlackJack_player("James", 1000);
        BlackJack_game blackJack = new BlackJack_game(james);

        blackJack.start();
    }
}
