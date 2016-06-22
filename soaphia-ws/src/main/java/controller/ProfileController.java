package controller;

import repository.SofiaRepository;
import spark.Request;
import spark.Response;

/**
 * Created by richard on 6/22/16.
 */
public class ProfileController extends AbstractController {
  private final SofiaRepository repository;

  public ProfileController(SofiaRepository repository)
  {
    this.repository = repository;
  }

  public String handle(Request req, Response response)
  {
    return toJson(this.repository.getProfile());
  }
}
