package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame athletic;
	
	@BeforeClass
	public static void inizializzazione(){
		athletic= new AthleticGame("");
	}
	
	@Test
	public void test1(){
		athletic.addArrival(null, Instant.now());
		Assert.assertEquals(1,athletic.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2(){
		athletic.getParecipiantTime("");
	}
	
	
}
