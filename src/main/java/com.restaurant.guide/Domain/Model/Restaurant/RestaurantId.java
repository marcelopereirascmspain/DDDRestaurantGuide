package com.restaurant.guide;

import java.util.UUID;

public class RestaurantId {
  private UUID id;

  public RestaurantId() {
    this.id = UUID.randomUUID();
  }

  public UUID id() {
    return this.id;
  }

  @Override
  public boolean equals(Object restaurantId) {
    return this.id().equals(((RestaurantId)restaurantId).id());
  }
}