package datasource.decoder;

import com.google.gson.Gson;
import datasource.models.Profile;

import java.util.Optional;

public class ProfileDecoder
{
  public static Optional<Profile> decode(String json)
  {
    Gson gson = new Gson();
    return Optional.ofNullable(gson.fromJson(json, Profile.class));
  }
}
