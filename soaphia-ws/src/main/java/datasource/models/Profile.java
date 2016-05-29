package datasource.models;

/**
 * Created by richard on 5/29/16.
 */
public class Profile {
  private String id;
  private String profile_path;
  private String popularity;
  private String place_of_birth;
  private String name;
  private String imdbId;
  private String adult;
  private String also_known_as;
  private String biography;
  private String birthday;
  private String deathDay;
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

  public String getPlace_of_birth() {
    return place_of_birth;
  }

  public void setPlace_of_birth(String place_of_birth) {
    this.place_of_birth = place_of_birth;
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

  public String getAlso_known_as() {
    return also_known_as;
  }

  public void setAlso_known_as(String also_known_as) {
    this.also_known_as = also_known_as;
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
    return deathDay;
  }

  public void setDeathday(String deathDay) {
    this.deathDay = deathDay;
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
