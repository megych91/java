package com.codingdojo.master;

public class Human {
	public int strength;
	public int stealth;
	public int health;
	public int intelligence;
	public String name;
	
	public Human () {
		this.strength = 3;
		this.stealth = 3;
		this.health = 100;
		this.intelligence = 3;
	}
	public Human(String name) {
		this.name = name;
		this.strength = 3;
		this.stealth = 3;
		this.health = 100;
		this.intelligence = 3;
	}
	public Human(String name, int health, int intelligence, int stealth, int strength) {
		this.strength = strength;
		this.stealth = stealth;
		this.health = health;
		this.intelligence = intelligence;
	}
	
	public int getStrength() {
		return strength;
	}
	public int getStealth() {
		return stealth;
	}
	public int getHealth() {
		return health;
	}
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setStrength() {
		this.strength = strength;
	}
	public void setStealth() {
		this.stealth = stealth;
	}
	public void setHealth() {
		this.health = health;
	}
	public void setIntelligence() {
		this.intelligence = intelligence;
	}
	public void attacks(Human enemy) {
		enemy.health -= this.strength;
		System.out.println("Charle\'s health has now decreased to: " + enemy.getHealth() + "\n");
	}
	

}
