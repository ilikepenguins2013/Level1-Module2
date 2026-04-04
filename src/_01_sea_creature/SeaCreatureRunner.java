package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		spongebob.eat();
		spongebob.laugh();
		String name1 = patrick.getName();
		String name2 = squidward.getName();
		System.out.println(name1);
		System.out.println(name2);
		patrick.eat();
		patrick.laugh();
		squidward.eat();
		squidward.laugh();

	}

}
