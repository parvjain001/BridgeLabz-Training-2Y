package level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper")))
            return "Player";
        return "Computer";
    }

    public static String[][] calculateStats(String[] winners) {
        int playerWins = 0, computerWins = 0, draws = 0;
        int totalGames = winners.length;

        for (String w : winners) {
            if (w.equals("Player")) playerWins++;
            else if (w.equals("Computer")) computerWins++;
            else draws++;
        }

        double playerPercent = ((double) playerWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;

        String[][] stats = new String[4][2];
        stats[0][0] = "Player Wins"; stats[0][1] = String.valueOf(playerWins);
        stats[1][0] = "Computer Wins"; stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Draws"; stats[2][1] = String.valueOf(draws);
        stats[3][0] = "Winning Percentage"; stats[3][1] = "Player: " + String.format("%.2f", playerPercent) + "%, Computer: " + String.format("%.2f", computerPercent) + "%";

        return stats;
    }

    public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners) {
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t" + computerChoices[i] + "\t" + winners[i]);
        }

        String[][] stats = calculateStats(winners);
        System.out.println("\nStats:");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice for game " + (i + 1) + " (Rock/Paper/Scissors): ");
            userChoices[i] = sc.nextLine();
            computerChoices[i] = getComputerChoice();
            winners[i] = findWinner(userChoices[i], computerChoices[i]);
        }

        displayResults(userChoices, computerChoices, winners);
        sc.close();
    }
}
