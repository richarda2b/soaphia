package datasource.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by richard on 5/29/16.
 */
public class Profile {
  private String id;
  @SerializedName("profile_path")
  private String profile_path;
  private String popularity;
  @SerializedName("place_of_birth")
  private String placeOfBirth;
  private String name;
  @SerializedName("imdb_id")
  private String imdbId;
  private String adult;
  @SerializedName("also_known_as")
  private List<String> alsoKnownAs;
  private String biography;
  private String birthday;
  private String deathday;
  private String gender;
  private String homepage;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProfile_path() {
    return profile_path;
  }

  public void setProfile_path(String profile_path) {
    this.profile_path = profile_path;
  }

  public String getPopularity() {
    return popularity;
  }

  public void setPopularity(String popularity) {
    this.popularity = popularity;
  }

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }

  public String getAdult() {
    return adult;
  }

  public void setAdult(String adult) {
    this.adult = adult;
  }

  public List<String> getAlsoKnownAs() {
    return alsoKnownAs;
  }

  public void setAlsoKnownAs(List<String> alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getDeathday() {
    return deathday;
  }

  public void setDeathDay(String deathDay) {
    this.deathday = deathDay;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getHomepage() {
    return homepage;
  }

  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }
}
