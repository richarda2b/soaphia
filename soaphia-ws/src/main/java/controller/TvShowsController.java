package controller;

import repository.SofiaRepository;
import spark.Request;
import spark.Response;

/**
 * Created by richard on 6/22/16.
 */
public class TvShowsController extends AbstractController {
  private SofiaRepository repository;

  public TvShowsController(SofiaRepository repository)
  {
    this.repository = repository;
  }

  public String handleTvShows(Request req, Response response)
  {
    return toJson(this.repository.getTvShows());
  }
}
