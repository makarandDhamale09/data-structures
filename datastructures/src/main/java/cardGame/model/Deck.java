package cardGame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private final List<Card> cards = new ArrayList<>();

  public Deck() {
    for (Suite suite : Suite.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suite);
        cards.add(card);
      }
    }
  }

  public void showAllCards() {
    cards.forEach(c -> System.out.println(c.getCard()));
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card dealCardFromTop() {
    if (cards.isEmpty()) {
      throw new RuntimeException("No more Cards in the Deck");
    }
    return cards.remove(0);
  }
}
