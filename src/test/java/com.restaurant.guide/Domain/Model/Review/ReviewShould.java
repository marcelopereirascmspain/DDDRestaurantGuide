package com.restaurant.guide;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReviewShould {

  @Test
  public void be_correctly_created_with_valid_values() {
    Rating ratingOfOne = new Rating(1);
    Rating ratingOfTwo = new Rating(2);
    Rating ratingOfThree = new Rating(3);
    Rating ratingOfFour = new Rating(4);
    Rating ratingOfFive = new Rating(5);

    assertEquals(1, (int)ratingOfOne.value());
    assertEquals(2, (int)ratingOfTwo.value());
    assertEquals(3, (int)ratingOfThree.value());
    assertEquals(4, (int)ratingOfFour.value());
    assertEquals(5, (int)ratingOfFive.value());
  }

  @Test(expected=IllegalArgumentException.class)
  public void throw_when_creating_a_rating_with_values_less_than_one() {
    Rating rating = new Rating(0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void throw_when_creating_a_rating_with_values_more_than_five() {
    Rating rating = new Rating(6);
  }
}