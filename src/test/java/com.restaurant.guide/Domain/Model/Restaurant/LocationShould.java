package com.restaurant.guide;

import static org.junit.Assert.*;
import org.junit.Test;

public class LocationShould {

  @Test
  public void be_properly_constructed() {
    Location location = new Location(50.0, 3.0);

    assertEquals(50.0, (double)location.latitude(), 0);
    assertEquals(3.0, (double)location.longitude(), 0);
  }

  @Test
  public void be_able_to_construct_a_location_at_the_origin() {
    Location location = new Location(0.0, 0.0);

    assertEquals(0.0, (double)location.latitude(), 0);
    assertEquals(0.0, (double)location.longitude(), 0);
  }

  @Test
  public void be_able_to_construct_a_location_at_the_minimum_latitude() {
    Location location = new Location(-90.0, 0.0);

    assertEquals(-90.0, (double)location.latitude(), 0);
  }

  @Test
  public void be_able_to_construct_a_location_at_the_maximum_latitude() {
    Location location = new Location(90.0, 0.0);

    assertEquals(90.0, (double)location.latitude(), 0);
  }

  @Test
  public void be_able_to_construct_a_location_at_the_minimum_longitude() {
    Location location = new Location(0.0, -180.0);

    assertEquals(-180.0, (double)location.longitude(), 0);
  }

  @Test
  public void be_able_to_construct_a_location_at_the_maximum_longitude() {
    Location location = new Location(0.0, 180.0);

    assertEquals(180.0, (double)location.longitude(), 0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void throw_when_the_latitude_value_is_below_the_minimum_value() {
    Location location = new Location(-90.1, 0.0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void throw_when_the_latitude_value_is_above_the_maximum_value() {
    Location location = new Location(90.1, 0.0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void throw_when_the_longitude_value_is_below_the_minimum_value() {
    Location location = new Location(0.0, -180.1);
  }

  @Test(expected=IllegalArgumentException.class)
  public void throw_when_the_longitude_value_is_above_the_maximum_value() {
    Location location = new Location(0.0, 180.1);
  }
}