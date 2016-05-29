package datasource.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by richard on 5/29/16.
 */
public class Movie {
  private String title;
  @SerializedName("release_date")
  private String releaseDate;
  @SerializedName("poster_path")
  private String posterPath;
  @SerializedName("original_title")
  private String originalTitle;
  private String id;
  @SerializedName("credit_id")
  private String creditId;
  private String character;
  private String adult;

  public Movie() {
  }

  public Movie(String title, String releaseDate, String posterPath, String originalTitle, String id, String creditId, String character, String adult) {
    this.title = title;
    this.releaseDate = releaseDate;
    this.posterPath = posterPath;
    this.originalTitle = originalTitle;
    this.id = id;
    this.creditId = creditId;
    this.character = character;
    this.adult = adult;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getPosterPath() {
    return posterPath;
  }

  public void setPosterPath(String posterPath) {
    this.posterPath = posterPath;
  }

  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCreditId() {
    return creditId;
  }

  public void setCreditId(String creditId) {
    this.creditId = creditId;
  }

  public String getCharacter() {
    return character;
  }

  public void setCharacter(String character) {
    this.character = character;
  }

  public String getAdult() {
    return adult;
  }

  public void setAdult(String adult) {
    this.adult = adult;
  }
}
