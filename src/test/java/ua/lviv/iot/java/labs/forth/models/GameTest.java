package ua.lviv.iot.java.labs.forth.models;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	private Game game;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		game = new Game("\"Truth or action\" game", 1000, Gender.INTERSEX, true, 23029335, "Belgium", 8,
				3, 10, "Take turns in doing actions or telling the truth about something", "FreeTableGames");
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGameAllArgsConstructor() {
		Assertions.assertEquals("\"Truth or action\" game", game.getName());
		Assertions.assertEquals(1000, game.getPriceInUAH());
		Assertions.assertEquals(Gender.INTERSEX, game.getForGender());
		Assertions.assertEquals(true, game.isDiscounted());
		Assertions.assertEquals(23029335, game.getId());
		Assertions.assertEquals("Belgium", game.getOrigin());
		Assertions.assertEquals(8, game.getSinceAge());
		Assertions.assertEquals(3, game.getMinCountOfPlayers());
		Assertions.assertEquals(10, game.getMaxCountOfPlayers());
		Assertions.assertEquals("Take turns in doing actions or telling the truth about something", game.getAboutGame());
		Assertions.assertEquals("FreeTableGames", game.getPublisher());
		Assertions.assertEquals(1000, game.getPriceInUAH());
		Assertions.assertEquals("Game", game.getTypeName());
	}

}
