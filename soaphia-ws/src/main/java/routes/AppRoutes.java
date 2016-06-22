package routes;

import controller.MoviesController;
import controller.ProfileController;
import controller.TvShowsController;
import repository.SofiaRepository;

import static spark.Spark.*;
/**
 * Created by richard on 6/22/16.
 */
public class AppRoutes {

  private final String DEFAULT = "/";
  private final String pathToMovies = "/movies";
  private final String pathToTvShows = "/tvshows";
  private final String pathToProfile = "/profile";

  public void getRoutes(MoviesController moviesController, TvShowsController tvShowsController,
                        ProfileController profileController)
  {
    get(DEFAULT, profileController::handle);
    get(pathToMovies, moviesController::handle);
    get(pathToTvShows, tvShowsController::handleTvShows);
    get(pathToProfile, profileController::handle);
  }
}
