package com.restaurant.guide;

import java.util.List;

public interface RestaurantRepository {
  public Restaurant findById(RestaurantId id);
  public List<Restaurant> findAll();
  public void add(Restaurant restaurant);
}