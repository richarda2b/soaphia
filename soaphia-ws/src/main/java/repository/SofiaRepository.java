package repository;

import datasource.models.Movie;
import datasource.models.TvShow;

import java.util.List;

public interface SofiaRepository {
    List<Movie> getMovies();
    List<TvShow> getTvShows();
}
