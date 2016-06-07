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