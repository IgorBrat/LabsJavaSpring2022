package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Game extends Good {
  private int sinceAge;
  private int minCountOfPlayers;
  private int maxCountOfPlayers;
  private String aboutGame;
  private String publisher;

  public Game(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id,
      String origin, int sinceAge, int minCountOfPlayers, int maxCountOfPlayers, String aboutGame,
      String publisher) {
    super(name, priceInUAH, forGender, isDiscounted, id, origin);
    this.setSinceAge(sinceAge);
    this.setMinCountOfPlayers(minCountOfPlayers);
    this.setMaxCountOfPlayers(maxCountOfPlayers);
    this.setAboutGame(aboutGame);
    this.setPublisher(publisher);
    this.setTypeName("Game");
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",SinceAge,MinCountOfPlayers,MaxCountOfPlayers,AboutGame,Publisher";
  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + sinceAge + "," + minCountOfPlayers + "," + maxCountOfPlayers + ","
        + aboutGame + "," + publisher;
  }
}
