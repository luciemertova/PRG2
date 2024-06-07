package Sibenice;

public class Run {
    public static void main(String[] args) {

        // test inputu:
        Reader r = new Reader();
//        String in = r.readInput();
//        System.out.println("ulozeno: " + in);
        Player p = new Player("Tester");
        Game game = new Game(p, r);
        game.startGame();

    }
}
