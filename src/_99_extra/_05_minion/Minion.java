package _99_extra._05_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	String getName(){
		return name;
	}
	String getColor(){
		return color;
	}
	int getEyes(){
		return eyes;
	}
	void setMaster(String mater){
		master = mater;
	}
	String getMaster() {
		return master;
	}
}
