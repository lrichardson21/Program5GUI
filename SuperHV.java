package program5;


import java.util.ArrayList;

public class SuperHV extends Character{
	private ArrayList<String> powers;

	public SuperHV() {
	}

	public ArrayList<String> getPowers() {
		return powers;
	}

	public void setPowers(ArrayList<String> powers) {
		this.powers = powers;
	}
	public void setPowers(String power) {
		powers.add(power);
	}
	
	public String powerString(){
		String powersString = String.join(", ", powers);
		return powersString;
	}
	
	@Override
	public String toString(){
		String result = "";
		result += ("   Name:         " + getName());
		result += ("\n   Team:         " + getTeam());
		result += ("\n   Universe:     " + getUniverse());
		result += ("\n   Home Planet:  " + getHomePlanet());
		System.out.println("");
		result += s;
		result += ("\n   Powers:       " +  powerString());
		result += ("\n  ");
		return result;
	}
	
	

	
}
