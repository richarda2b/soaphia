package controller;

import com.google.gson.Gson;

/**
 * Created by richard on 6/22/16.
 */
public class AbstractController {

  private final Gson gson;

  public AbstractController() {
    this.gson = new Gson();
  }

  protected String toJson(Object object)
  {
    return this.gson.toJson(object);
  }
}
