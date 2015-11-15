package com.restaurant.guide;

public class Location {
  private final double MIN_LATITUDE = -90.0;
  private final double MAX_LATITUDE = 90.0;
  private final double MIN_LONGITUDE = -180.0;
  private final double MAX_LONGITUDE = 180.0;
  
  private double latitude;
  private double longitude;

  public Location(double latitude, double longitude) {
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

  public double latitude() {
    return this.latitude;
  }

  public double longitude() {
    return this.longitude;
  }
}