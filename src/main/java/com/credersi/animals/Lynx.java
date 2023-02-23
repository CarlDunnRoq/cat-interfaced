package com.credersi.animals;

public class Lynx extends Animal implements Purr, Running {
	public Lynx() {	}
	
	public int purr() {
		return 30;
	}
	
	public int running() {
		return 80;
	}
}