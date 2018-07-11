package com.codingdojo.phoneassignment;

public class iphone extends Phone {
	public iphone(String owner, int number, int batteryLevel, String carrier) {
		this.owner = owner;
		this.number = number;
		this.batteryLevel = batteryLevel;
		this.carrier = carrier;
	}
	
	public void ring(Phone phone) {
		System.out.println("*iphone ringtone*");
		if(batteryLevel < 50) {
			System.out.println("Please buy a new battery....");
		} else {
			answer(phone);
		}
	}
	public Phone answer(Phone phone) {
		System.out.println(phone.owner + " is calling you.");
	}

}
