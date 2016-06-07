import datasource.DataBuilder;
import datasource.models.Movie;
import repository.SofiaRepository;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

/**
 * Created by richard on 5/29/16.
 */
public class Main {
  public static void main(String [] args) {

    Optional<SofiaRepository> maybeRepo = DataBuilder.build("/json-data/movies.json", "/json-data/tv-shows.json");

    maybeRepo.ifPresent(repo ->
            System.out.println("Movies: " + repo.getMovies().size() + ", Tv Shows: " + repo.getTvShows().size()));

    assert (maybeRepo.isPresent());
  }
}
