import java.util.*;

class Movie {
    String name;
    String genre;
    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    public String toString() { return name + " (" + genre + ")"; }
}

public class StreamingApp {
    public static void main(String[] args) {
        Stack<Movie> watchHistory = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("3 Idiots", "Drama"));

        Set<String> genresWatched = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(2));

        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            watchHistory.push(current);
            genresWatched.add(current.genre);
        }

        for (Movie m : allMovies)
            if (genresWatched.contains(m.genre)) System.out.println(m);
    }
}
