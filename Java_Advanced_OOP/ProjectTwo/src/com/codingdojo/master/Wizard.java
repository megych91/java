package com.codingdojo.master;

public class Wizard  extends Human{
	
	public Wizard () {
		this.health = 50;
		this.intelligence = 8;	
	}
	public Wizard(String name) {
		super(name);
		this.health = 50;
		this.intelligence = 8;
	}
	public void healer(Human friend) {
		friend.health += this.intelligence;
		System.out.println(this.name + " has healed " + friend.name + " and their health is now: " + friend.health + "\n");
	}
	public void fireball(Human enemy) {
		enemy.health -= (this.intelligence*3);
		System.out.println(this.name + " has thrown fireballs at " + enemy.name + " and their health is now: " + enemy.health  + "\n");
	}
}
