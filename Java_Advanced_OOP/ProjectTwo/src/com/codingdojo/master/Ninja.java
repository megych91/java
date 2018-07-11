package com.codingdojo.master;

public class Ninja extends Human{
	public Ninja () {
		this.stealth = 10;
	}
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	public void steal(Human loser) {
		int stealing = loser.getStealth();
		this.health += stealing;
		loser.health -= stealing;
		System.out.println(this.name + " has stolen "+ loser.stealth +" stealth from " + loser.name + "\n");
		System.out.println(this.name + "\'s health is now at: "+ this.health + "\n");
	}
	public void runAway(Human loser) {
		loser.health -= 10;
		System.out.println(loser.name + " has ran away from " + this.name + "\n");
	}
}
