package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	public void throwSomething() {
		energyLevel -= 5; 
		System.out.println("You're energy level has decreased to " + energyLevel);
	}
	public void eatSomething() {
		energyLevel += 10;
		System.out.println("You're energy level has increased to " + energyLevel);
	}
	public void climb() {
		energyLevel -= 2;
		System.out.println("You've climbed a damn tree! You're energy level has decreased to " + energyLevel);
	}
}
