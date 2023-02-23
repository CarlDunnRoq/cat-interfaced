package com.credersi.animals;

public class Camel extends Animal implements Spits {
	public Camel() { }
	
	public boolean spits() {
		return true;
	}
	
	public int running() {
		return 65;
	}
}