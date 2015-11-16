package com.restaurant.guide;

import static org.junit.Assert.*;
import org.junit.Test;

public class RestaurantShould {

  @Test
  public void be_properly_created() {
    RestaurantId id = new RestaurantId();
    String name = "Los tres hermanos";
    Location location = new Location(40.4, 3.3);

    Restaurant restaurant = new Restaurant(id, name, location);

    assertEquals(id, restaurant.id());
    assertEquals(name, restaurant.name());
    assertEquals(location, restaurant.location());
  }
}