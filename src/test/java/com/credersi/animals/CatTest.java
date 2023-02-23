package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	private int runningSpeed(Running runner) {
		return(runner.running());
	}
	
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
	
	@Test
	public void polymorphicTest() {
		Running camel = new Camel();
		Running lynx = new Lynx();
		Running wolf = new Wolf();
		Running cat = new Cat();
		assertEquals(this.runningSpeed(camel), 65);
		assertEquals(this.runningSpeed(lynx), 80);
		assertEquals(this.runningSpeed(wolf), 55);
		assertEquals(this.runningSpeed(cat), 48);
	}
}
	

