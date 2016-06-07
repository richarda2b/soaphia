package datasource;

import datasource.decoder.MoviesDecoder;
import datasource.decoder.TvShowDecoder;
import datasource.models.Movie;
import datasource.models.Profile;
import datasource.models.TvShow;
import infrastructure.ResourceReader;
import repository.InMemorySofiaRepository;
import repository.SofiaRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

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



    public static Optional<SofiaRepository> build(String moviesPath, String tvShowsPath)
    {
        Optional<Map<String, Movie>> maybeMovies = loadMovies(moviesPath);
        Optional<Map<String, TvShow>> maybeTvShows = loadTvShows(tvShowsPath);

        return maybeMovies.flatMap(movies ->
                maybeTvShows.map(tvShows -> new InMemorySofiaRepository(movies, tvShows)));
    }

    private static Optional<Map<String, Movie>> loadMovies(String path)
    {
        return ResourceReader.read(path)
                             .flatMap(MoviesDecoder::decode)
                             .map(movies -> toMap(movies, Movie::getId));
    }

    private static Optional<Map<String, TvShow>> loadTvShows(String path)
    {
        return ResourceReader.read(path)
                             .flatMap(TvShowDecoder::decode)
                             .map(tvShows -> toMap(tvShows, TvShow::getId));
    }

    private static <T> Map<String, T> toMap(List<T> values, Function<T, String> getId)
    {
        return values.stream().collect(Collectors.toMap(getId, Function.identity()));
    }
}
