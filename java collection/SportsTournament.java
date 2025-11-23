import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;
    Team(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        return name.equals(((Team)o).name);
    }
    public int hashCode() { return Objects.hash(name); }
    public int compareTo(Team t) { return t.points - this.points; }
    public String toString() { return name + " : " + points; }
}

class Match {
    Team t1, t2;
    Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
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

public class SportsTournament {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Team a = new Team("TeamA", 10);
        Team b = new Team("TeamB", 5);
        Team c = new Team("TeamC", 8);

        teams.add(a);
        teams.add(b);
        teams.add(c);

        Queue<Match> fixtures = new LinkedList<>();
        fixtures.add(new Match(a, b));
        fixtures.add(new Match(b, c));

        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();

        while (!fixtures.isEmpty()) {
            Match m = fixtures.poll();
            Team winner = m.t1;
            winner.points += 3;
            results.add(new Result(m.t1.name + " vs " + m.t2.name, winner.name));
        }

        leaderboard.addAll(teams);
    }
}
