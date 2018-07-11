package com.codingdojo.master;

public class MasterTest {
	public static void main(String[]args) {
		
		// CREATING NEW HUMANS // 
		
		Human charles = new Human("Charles");
		System.out.println(charles.name+"'s Stats =  " + "|"+
		"Strength: " + charles.getStrength() + "|" + 
		"Stealth: " + charles.getStealth()  + "|" +
		"Health: " + charles.getHealth()  + "|" +
		"Intelligence: " + charles.getIntelligence() + "\n");
		
		Human diamond = new Human("Diamond");
		System.out.println(diamond.name+"'s Stats =  " + "|"+
		"Strength: " + diamond.getStrength() + "|" + 
		"Stealth: " + diamond.getStealth()  + "|" +
		"Health: " + diamond.getHealth()  + "|" +
		"Intelligence: " + diamond.getIntelligence() + "\n");
		
		
		// HUMAN ATTACKS ENEMY // 
		diamond.attacks(charles);
		
		
		// CREATING WIZARDS //
		
		Wizard merlin = new Wizard("Merlin");
		System.out.println(merlin.name+"'s Stats =  " + "|"+
		"Strength: " + merlin.getStrength() + "|" + 
		"Stealth: " + merlin.getStealth()  + "|" +
		"Health: " + merlin.getHealth()  + "|" +
		"Intelligence: " + merlin.getIntelligence() + "\n");
		
		
		// Wizard heals Human //
		merlin.healer(diamond);
		
		
		
		// Wizard throws fireball at Human // 
		merlin.fireball(charles);
		
		
		
		// CREATING NINJAS //
		
		Ninja raphael = new Ninja("Raphael");
		System.out.println(raphael.name+"'s Stats =  " + "|"+
		"Strength: " + raphael.getStrength() + "|" + 
		"Stealth: " + raphael.getStealth()  + "|" +
		"Health: " + raphael.getHealth()  + "|" +
		"Intelligence: " + raphael.getIntelligence() + "\n");
		
		
		// Ninja steals from Human // 
		raphael.steal(charles);
		
		
		// Human runs away from Ninja // 
		raphael.runAway(charles);
		
		
		// CREATING SAMURAIS //
		
		
		Samurai hideyoshi = new Samurai("Hideyoshi");
//		System.out.println(hideyoshi.name+"'s Stats =  " +
//		"Strength: " + hideyoshi.getStrength() + "  |  " + 
//		"Stealth: " + hideyoshi.getStealth()  + "  |  " +
//		"Health: " + hideyoshi.getHealth()  + "  |  " +
//		"Intelligence: " + hideyoshi.getIntelligence() + "\n");
//		hideyoshi.howMany();
				
		Samurai tadaaki = new Samurai("Tadaaki");
//		System.out.println(tadaaki.name+"'s Stats =  " +
//		"Strength: " + tadaaki.getStrength() + "  |  " + 
//		"Stealth: " + tadaaki.getStealth()  + "  |  " +
//		"Health: " + tadaaki.getHealth()  + "  |  " +
//		"Intelligence: " + tadaaki.getIntelligence() + "\n");
//		tadaaki.howMany();
				
		Samurai tomoe = new Samurai("Tomoe");
//		System.out.println(tomoe.name+"'s Stats =  " +
//		"Strength: " + tomoe.getStrength() + "  |  " + 
//		"Stealth: " + tomoe.getStealth()  + "  |  " +
//		"Health: " + tomoe.getHealth()  + "  |  " +
//		"Intelligence: " + tomoe.getIntelligence() + "\n");
//		tomoe.howMany();
		
		
		// Samurai kills Human // 
		tadaaki.deathBlow(charles);
		tomoe.deathBlow(charles);
		
		
		// Meditate to Heal Samurai // 
		tomoe.mediate();
		
	}
}
