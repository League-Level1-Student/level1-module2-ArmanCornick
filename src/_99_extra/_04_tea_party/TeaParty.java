package _99_extra._04_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if(isWoman) {
			if(isKnighted) {
				System.out.println("Welcome Lady " + name);
				return "Welcome Lady " + name; 
			} else {
				System.out.println("Welcome Ms. " + name);
				return "Welcome Ms. " + name; 
			}
		} else {
			if(isKnighted) {
				System.out.println("Weclome Sir " + name);
				return "Welcome Sir " + name; 
			} else {
				System.out.println("Welcome Mr. " + name);
				return "Welcome Mr. " + name; 
			}
		}
	}
	public static void main(String[] args) {
		TeaParty party = new TeaParty();
		party.welcome("James", false, true);
		party.welcome("samantha", true, true);
		party.welcome("isaac", false, false);
		party.welcome("melissa", true, false);
	}
}
