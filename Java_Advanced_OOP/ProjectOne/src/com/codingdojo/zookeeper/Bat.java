package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	int energyLevel = 300;
	public void fly() {
		energyLevel -= 50; 
		System.out.println("Insert Bat flying sound here. Your energy level has decreased to " + energyLevel);
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Your energy level has increased to " + energyLevel);
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Aaahhhh!!! The town is on fire! Your energy level has decreased to " + energyLevel);
	}

}
