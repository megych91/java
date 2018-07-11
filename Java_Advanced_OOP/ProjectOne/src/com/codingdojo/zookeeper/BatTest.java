package com.codingdojo.zookeeper;
	
public class BatTest{
	public static void main(String[]args) {
		Bat charles = new Bat();
		charles.attackTown();
		charles.attackTown();
		charles.attackTown();
		charles.eatHumans();
		charles.eatHumans();
		charles.fly();
		charles.fly();
		System.out.println("Bat Charles energy level is " + charles.displayEnergy());
	}
}
