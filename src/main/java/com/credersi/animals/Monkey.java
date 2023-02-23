package com.credersi.animals;

public class Monkey extends Animal implements Typewrites, Spits {
	public Monkey() {	}
	
	public int typewrites() {
		return 3;
	}
	
	public boolean spits() {
		return true;
	}
}