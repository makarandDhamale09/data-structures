package cardGame.model;

public class Card {
  private Rank rank;
  private Suite suite;

  public Card(Rank rank, Suite suite) {
    this.rank = rank;
    this.suite = suite;
  }

  public int getRankValue() {
    return this.rank.value;
  }

  public String getCard() {
    return rank.toString() + " of " + suite.toString();
  }
}
