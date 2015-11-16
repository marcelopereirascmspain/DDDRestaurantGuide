package com.restaurant.guide;

import static org.junit.Assert.*;
import org.junit.Test;

public class RestaurantIdShould {

  @Test
  public void generate_a_unique_id_each_time_it_is_called() {
    RestaurantId idOne = new RestaurantId();
    RestaurantId idTwo = new RestaurantId();

    assertEquals(false, idOne.equals(idTwo));
  }
}