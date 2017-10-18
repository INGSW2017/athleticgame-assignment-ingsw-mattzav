package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame game;

	@BeforeClass
	public static void inizializzazione() {
		game = new AthleticGame("");
	}

	@After
	public void test1() {
		game.reset();
	}

	@Before
	public void test3() {
		game.start();
	}

	@Test
	public void test4() {
		game.addArrival("ma", Instant.now());
		Assert.assertEquals("ma", game.getWinner());
	}

	@Test
	public void test5() {
		game.addArrival("marco", Instant.EPOCH.plusMillis(10));
		game.addArrival("stefano", Instant.EPOCH.plusMillis(10));
		Assert.assertEquals("marco", game.getWinner());
	}

}
