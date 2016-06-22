import controller.MoviesController;
import controller.ProfileController;
import controller.TvShowsController;
import datasource.DataBuilder;
import repository.SofiaRepository;
import routes.AppRoutes;

import java.util.Optional;


public class Main {
  public static void main(String[] args) {

    Optional<SofiaRepository> maybeRepo = DataBuilder.build("/json-data/movies.json",
      "/json-data/tv-shows.json", "/json-data/profile.json");

    maybeRepo.ifPresent(repository ->
    {
      final ProfileController profileController = new ProfileController(repository);
      final MoviesController moviesController = new MoviesController(repository);
      final TvShowsController tvShowsController = new TvShowsController(repository);

      new AppRoutes().getRoutes(moviesController, tvShowsController, profileController);
    });

  }
}
