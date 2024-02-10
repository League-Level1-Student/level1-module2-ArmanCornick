package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature squidward = new SeaCreature("squidward");
		SeaCreature patrick = new SeaCreature("patrick");
		spongebob.eat();
		spongebob.laugh();
		patrick.eat();
		patrick.laugh();
		squidward.eat();
		squidward.laugh();
		
	}
}
