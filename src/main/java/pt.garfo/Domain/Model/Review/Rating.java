package pt.garfo;

public class Rating {
  private final Integer MIN_VALUE = 1;
  private final Integer MAX_VALUE = 5;

  private Integer value;

  public Rating(Integer value) throws IllegalArgumentException {
    // @todo should I validate first and make validate accept a value?
    this.value = value;
    // @todo should I validate this at the constructor level?
    this.validate();
  }

  private void validate() {
    if (this.value < this.MIN_VALUE || this.value > this.MAX_VALUE) {
      throw new IllegalArgumentException("Rating values must be between 1 and 5.");
    }
  }

  public Integer value() {
    return this.value;
  }

  @Override
  public boolean equals(Object rating) {
    return this.value() == ((Rating)rating).value();
  }

  @Override
  public String toString() {
    return this.value().toString();
  }
}