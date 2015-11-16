package com.restaurant.guide;

import java.util.List;
import java.util.ArrayList;

public class InMemoryRestaurantRepository implements RestaurantRepository {
  List<Restaurant> restaurants = new ArrayList<Restaurant>();

  public Restaurant findById(RestaurantId id) {
    return this.restaurants.get(0);
  }

  public List<Restaurant> findAll() {
    return this.restaurants;
  }

  public void add(Restaurant restaurant) {
    this.restaurants.add(restaurant);
  }
}