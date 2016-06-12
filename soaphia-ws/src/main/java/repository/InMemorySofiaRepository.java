package repository;

import datasource.models.Movie;
import datasource.models.Profile;
import datasource.models.TvShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InMemorySofiaRepository implements SofiaRepository {

    private Map<String, Movie> movies;
    private Map<String, TvShow> tvShows;
    private Profile profile;

    public InMemorySofiaRepository(Profile profile, Map<String, Movie> movies, Map<String, TvShow> tvShows)
    {
        this.profile = profile;
        this.movies = movies;
        this.tvShows = tvShows;
    }

    @Override
    public List<Movie> getMovies() {
        List movies = new ArrayList();
        movies.addAll(this.movies.values());

        return movies;
    }

    @Override
    public List<TvShow> getTvShows() {
        List tvShows = new ArrayList();
        tvShows.addAll(this.tvShows.values());

        return tvShows;
    }

    public Profile getProfile() {
        return this.profile;
    }
}
