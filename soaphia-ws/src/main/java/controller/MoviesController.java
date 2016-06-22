package controller;

import repository.SofiaRepository;
import spark.Request;
import spark.Response;

/**
 * Created by richard on 6/22/16.
 */
public class MoviesController extends AbstractController {
  private SofiaRepository repo;

  public MoviesController(SofiaRepository repo) {
    this.repo = repo;
  }

  public String handle(Request req, Response response)
  {
    return toJson(this.repo.getMovies());
  }
}
