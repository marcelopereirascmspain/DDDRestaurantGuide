package com.restaurant.guide;

public class Location {
  private final Double MIN_LATITUDE = -90.0;
  private final Double MAX_LATITUDE = 90.0;
  private final Double MIN_LONGITUDE = -180.0;
  private final Double MAX_LONGITUDE = 180.0;
  
  private Double latitude;
  private Double longitude;

  public Location(Double latitude, Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.validate();
  }

  private void validate() {
    if (this.latitude < MIN_LATITUDE || this.latitude > MAX_LATITUDE) {
      throw new IllegalArgumentException(
        "Latitude must be within the -90deg and +90deg range.");
    }

    if (this.longitude < MIN_LONGITUDE || this.longitude > MAX_LONGITUDE) {
      throw new IllegalArgumentException(
        "Longitude must be within the -180deg and +180deg range.");
    }
  }

  public Double latitude() {
    return this.latitude;
  }

  public Double longitude() {
    return this.longitude;
  }
}