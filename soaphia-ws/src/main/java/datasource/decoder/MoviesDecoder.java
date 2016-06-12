package datasource.decoder;

import com.google.gson.Gson;
import datasource.models.Movie;

import java.util.List;
import java.util.Optional;


public class MoviesDecoder {

    public static Optional<List<Movie>> decode(String json) {
        Gson gson = new Gson();
        return Optional.ofNullable(gson.fromJson(json, Filmography.class).getCast());
    }

    class Filmography {
        private String id;
        private List<Movie> cast;

        public List<Movie> getCast() {
            return cast;
        }
    }
}