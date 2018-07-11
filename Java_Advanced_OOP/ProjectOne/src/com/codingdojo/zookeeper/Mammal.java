package com.codingdojo.zookeeper;

public class Mammal {
	public int energyLevel = 20;
	
	public Mammal () {
		
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel; 
	}

}
