package datasource;

import datasource.decoder.MoviesDecoder;
import datasource.models.Movie;
import datasource.models.Profile;
import datasource.models.TvShow;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by richard on 5/28/16.
 */
public class DataBuilder {
    private Profile profile;
    private Map<String, Movie> movies;
    private Map<String, TvShow> tvShows;

    private Map<String, String> loadProfile()
    {
        return null;
    }

    public Optional<List<Movie>> loadMovies(Path path)
    {
        return new MoviesDecoder().parseFilmography(path);
    }

    private Map<String, String> loadTvShows()
    {
        return null;
    }
}
