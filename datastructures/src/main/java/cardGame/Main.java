package cardGame;

import cardGame.model.Dealer;
import cardGame.model.Player;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Dealer dealer = new Dealer();

    Player player1 = new Player();
    Player player2 = new Player();

    List<Player> players = new ArrayList<>();
    players.add(player1);
    players.add(player2);

    dealer.shuffle();
    dealer.dealCards(players, 10);

    int player1Points = player1.getPoints();
    int player2Points = player2.getPoints();

    if (player1Points > player2Points) {
      System.out.println("Player1 Wins!!");
    } else if (player1Points < player2Points) {
      System.out.println("Player2 Wins!!");
    } else {
      System.out.println("Its a Draw!!");
    }
  }
}
