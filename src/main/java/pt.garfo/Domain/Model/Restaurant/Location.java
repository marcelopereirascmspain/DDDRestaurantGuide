package pt.garfo;

public class Location {
  private String latitude;
  private String longitude;

  public Location(String latitude, String longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public String latitude() {
    return this.latitude;
  }

  public String longitude() {
    return this.longitude;
  }
}