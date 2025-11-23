import java.util.*;

class Player {
    String name;
    Player(String name) { this.name = name; }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        return name.equals(((Player)o).name);
    }
    public int hashCode() { return Objects.hash(name); }
    public String toString() { return name; }
}

class Match {
    Player p1, p2;
    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}

class Result {
    String match;
    String winner;
    Result(String m, String w) {
        this.match = m;
        this.winner = w;
    }
}

class Score implements Comparable<Score> {
    String player;
    int score;
    Score(String player, int score) {
        this.player = player;
        this.score = score;
    }
    public int compareTo(Score s) {
        return s.score - this.score;
    }
    public String toString() {
        return player + " : " + score;
    }
}

public class GamingTournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Parv"));
        players.add(new Player("Shreya"));
        players.add(new Player("Parv"));

        Queue<Match> matches = new LinkedList<>();
        Player p1 = new Player("Parv");
        Player p2 = new Player("Shreya");
        matches.add(new Match(p1, p2));

        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            Match m = matches.poll();
            results.add(new Result(m.p1 + " vs " + m.p2, m.p1.name));
            leaderboard.add(new Score(m.p1.name, 10));
            leaderboard.add(new Score(m.p2.name, 5));
        }
    }
}
