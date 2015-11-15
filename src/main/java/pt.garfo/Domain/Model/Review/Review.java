package pt.garfo;

public class Review {
  private String comment;
  private Rating rating;

  public Review(String comment, Rating rating) {
    this.comment = comment;
    this.rating = rating;
  }
}