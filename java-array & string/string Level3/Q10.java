import java.util.*;

public class Q10 {
    static String[] createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int k = 0;

        for (String s : suits) {
            for (String r : ranks) {
                deck[k++] = r + " of " + s;
            }
        }
        return deck;
    }

    static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static String[][] distribute(String[] deck, int players, int cards) {
        String[][] res = new String[players][cards];
        int k = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                res[i][j] = deck[k++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = createDeck();
        shuffle(deck);

        String[][] res = distribute(deck, players, cards);

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1));
            for (int j = 0; j < cards; j++) {
                System.out.println(res[i][j]);
            }
        }
        sc.close();
    }
}