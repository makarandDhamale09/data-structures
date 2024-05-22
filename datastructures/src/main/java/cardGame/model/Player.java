package cardGame.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
  List<Card> cards = new ArrayList<>();

  public void acceptCard(Card card) {
    cards.add(card);
  }

  public void showAllCards() {
    cards.forEach(c -> System.out.println(c.getCard()));
  }

  public int getPoints() {
    return cards.stream().mapToInt(Card::getRankValue).sum();
  }
}
