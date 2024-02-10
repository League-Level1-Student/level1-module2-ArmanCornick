package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("handy");
		Smurf PapaSmurf= new Smurf("PapaSmurf");
		Smurf Smurfette = new Smurf("Smurfette");
		handy.eat();
		handy.getName();
		PapaSmurf.getHatColor();
		PapaSmurf.isGirlOrBoy();
		Smurfette.isGirlOrBoy();
		Smurfette.getHatColor();
		
	}
}
