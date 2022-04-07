package ua.iot.java.labs.second.models;

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
	public int getSinceAge() {
		return sinceAge;
	}
	public void setSinceAge(int sinceAge) {
		this.sinceAge = sinceAge;
	}
	public int getMinCountOfPlayers() {
		return minCountOfPlayers;
	}
	public void setMinCountOfPlayers(int minCountOfPlayers) {
		this.minCountOfPlayers = minCountOfPlayers;
	}
	public int getMaxCountOfPlayers() {
		return maxCountOfPlayers;
	}
	public void setMaxCountOfPlayers(int maxCountOfPlayers) {
		this.maxCountOfPlayers = maxCountOfPlayers;
	}
	public String getAboutGame() {
		return aboutGame;
	}
	public void setAboutGame(String aboutGame) {
		this.aboutGame = aboutGame;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
