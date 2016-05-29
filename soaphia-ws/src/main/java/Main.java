import datasource.DataBuilder;
import datasource.models.Movie;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

/**
 * Created by richard on 5/29/16.
 */
public class Main {
  public static void main(String [] args) {

    Path filmography = Paths.get(Main.class.getResource("/json-data/movies.json").getPath());
    Optional<List<Movie>> movies = new DataBuilder().loadMovies(filmography);
  }
}
