package com.codingdojo.zookeeper;

public class GorillaTest {
	public static void main(String[]args) {
	Gorilla KingKong = new Gorilla();
	KingKong.throwSomething();
	KingKong.eatSomething();
	KingKong.climb();
	System.out.println("You did all that.... now your energy level is at: " + KingKong.displayEnergy());
	
	}
}
