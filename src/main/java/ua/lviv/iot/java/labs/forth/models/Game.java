package ua.lviv.iot.java.labs.forth.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Game extends Good{
	private int sinceAge;
	private int minCountOfPlayers;
	private int maxCountOfPlayers;
	private String aboutGame;
	private String publisher;
	public Game(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin,
			int sinceAge, int minCountOfPlayers, int maxCountOfPlayers, String aboutGame, String publisher) {
		super(name, priceInUAH, forGender, isDiscounted, id, origin);
		this.sinceAge = sinceAge;
		this.minCountOfPlayers = minCountOfPlayers;
		this.maxCountOfPlayers = maxCountOfPlayers;
		this.aboutGame = aboutGame;
		this.publisher = publisher;
		this.typeName = "Game";
	}
}