package pt.garfo;

public class Restaurant {
  private RestaurantId id;
  private String name;
  private Location location;

  public Restaurant(RestaurantId id, String name, Location location) {
    this.id = id;
    this.name = name;
    this.location = location;
  }

  public String name() {
    return this.name;
  }

  public Location location() {
    return this.location;
  }
}