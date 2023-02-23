package com.credersi.animals;

public class ScorpianFly extends Animal implements Spits, Flys {
	public ScorpianFly() {	}
	
	public boolean spits() {
		return true;
	}
	
	public boolean flys() {
		return true;
	}
}