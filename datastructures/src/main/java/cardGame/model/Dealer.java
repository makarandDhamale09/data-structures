package cardGame.model;

import java.util.List;

public class Dealer {
  private final Deck deck = new Deck();

  public void dealCards(List<Player> players, int noOfCards) {
    for (int i = 0; i < noOfCards; i++) {
      for (Player player : players) {
        var deltCard = deck.dealCardFromTop();
        player.acceptCard(deltCard);
      }
    }
  }

  public void shuffle() {
    deck.shuffle();
  }
}
