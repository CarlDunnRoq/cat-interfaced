package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}

	@Test
	public void testRuns() {
		Camel camel = new Camel();
		Lynx lynx = new Lynx();
		assertEquals(camel.running(), 65);
		assertEquals(lynx.running(), 80);
	}

	@Test
	public void testMonkeyTypes() {
		Monkey monkey = new Monkey();
		assertEquals(monkey.typewrites(), 3);
	}
	
	@Test
	public void testSpits() {
		Camel camel = new Camel();
		ScorpianFly scorpianfly = new ScorpianFly();
		assertTrue(camel.spits());
		assertTrue(scorpianfly.spits());
	}
	
	@Test
	public void testScorpianFly() {
		ScorpianFly scorpianfly = new ScorpianFly();
		assertTrue(scorpianfly.spits());
		assertTrue(scorpianfly.flys());
	}
	
	@Test
	public void testMonkey() {
		Monkey monkey = new Monkey();
		assertEquals(monkey.typewrites(), 3);
		assertTrue(monkey.spits());
	}
}
	

