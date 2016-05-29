package datasource.models;

/**
 * Created by richard on 5/29/16.
 */
public class TvShow {
  private String posterPath;
  private String originalName;
  private String name;
  private String id;
  private String firstAirDate;
  private String episodeCount;
  private String creditId;
  private String character;

  public TvShow() {
  }

  public TvShow(String posterPath, String originalName, String name, String id, String firstAirDate, String episodeCount, String creditId, String character) {
    this.posterPath = posterPath;
    this.originalName = originalName;
    this.name = name;
    this.id = id;
    this.firstAirDate = firstAirDate;
    this.episodeCount = episodeCount;
    this.creditId = creditId;
    this.character = character;
  }

  public String getPosterPath() {
    return posterPath;
  }

  public void setPosterPath(String posterPath) {
    this.posterPath = posterPath;
  }

  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstAirDate() {
    return firstAirDate;
  }

  public void setFirstAirDate(String firstAirDate) {
    this.firstAirDate = firstAirDate;
  }

  public String getEpisodeCount() {
    return episodeCount;
  }

  public void setEpisodeCount(String episodeCount) {
    this.episodeCount = episodeCount;
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
}
