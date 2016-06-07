package datasource.decoder;


import com.google.gson.Gson;
import datasource.models.TvShow;

import java.util.List;
import java.util.Optional;

public class TvShowDecoder {

    public TvShowDecoder() {
    }

    public static Optional<List<TvShow>> decode(String json) {
        Gson gson = new Gson();

        return Optional.ofNullable(gson.fromJson(json, TvShows.class).getCast());
    }


    class TvShows {
        private int id;
        private List<TvShow> cast;

        public TvShows() {

        }

        public List<TvShow> getCast() {
            return cast;
        }
    }

}

