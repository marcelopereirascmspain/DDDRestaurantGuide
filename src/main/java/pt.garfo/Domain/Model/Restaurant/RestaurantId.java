package pt.garfo;

public class RestaurantId {
  private String id;

  public RestaurantId() {
    this.id = id;
  }

  public String id() {
    return this.id;
  }

  @Override
  public boolean equals(Object restaurantId) {
    return this.id().equals(((RestaurantId)restaurantId).id());
  }
}