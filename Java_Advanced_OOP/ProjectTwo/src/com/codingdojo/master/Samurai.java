package com.codingdojo.master;

	public class Samurai  extends Human{
		static int num = 0;
		
		public Samurai () {
			this.health = 200;
		}
		public Samurai(String name) {
			super(name);
			this.health = 200;
			num ++;
		}
		public void deathBlow(Human object) {
			object.health = 0;
			this.health = (this.health / 2);
			System.out.println(this.name + " has attacked " + object.name + " with a DEATHBLOW and his health has decreased to: " + this.health + "\n");
		}
		public void mediate() {
			int healthstat = this.getHealth();
			this.health += (healthstat/2);
			System.out.println(this.name + "\'s health has increased to: " + this.health + "\n");
		}
		public void howMany() {
			System.out.println("Current number of Samurais: " + num + "\n");
		}
}
