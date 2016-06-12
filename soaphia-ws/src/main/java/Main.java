import datasource.DataBuilder;
import repository.SofiaRepository;

import java.util.Optional;


public class Main {
  public static void main(String[] args) {

    Optional<SofiaRepository> maybeRepo = DataBuilder.build("/json-data/movies.json",
      "/json-data/tv-shows.json", "/json-data/profile.json");

    maybeRepo.ifPresent(repo ->
      System.out.println("Name: " + repo.getProfile().getName()
        + ", Movies: " + repo.getMovies().size()
        + ", Tv Shows: " + repo.getTvShows().size()));

    assert (maybeRepo.isPresent());
  }
}
