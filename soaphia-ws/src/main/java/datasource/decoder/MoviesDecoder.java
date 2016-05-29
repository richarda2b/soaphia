package datasource.decoder;

import com.google.gson.Gson;
import datasource.models.Movie;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by richard on 5/29/16.
 */
public class MoviesDecoder {

  public Optional<List<Movie>> parseFilmography(Path path)
  {
    Gson gson = new Gson();

    try
    {
      List<String> lines = Files.readAllLines(path);
      String json = lines.stream().collect(Collectors.joining("\n"));

      return Optional.ofNullable(gson.fromJson(json, Filmography.class).getCast());
    } catch (IOException io)
    {
      return Optional.empty();
    }
  }

}

class Filmography {
  private String id;
  private List<Movie> cast;

  public List<Movie> getCast() {
    return cast;
  }

  public void setCast(List<Movie> cast) {
    this.cast = cast;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}