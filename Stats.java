package program5;


public class Stats extends Character {

	private int intelligence;
	private int strength;
	private int stamina;
	private int speed;
	private int skills;
	public int statTotal = 0;

	public Stats(int intelligence, int strength, int stamina, int speed, int skills) {
		this.intelligence = intelligence;
		this.strength = strength;
		this.stamina = stamina;
		this.speed = speed;
		this.skills = skills;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSkills() {
		return skills;
	}

	public void setSkills(int skills) {
		this.skills = skills;
	}
	
	public int getStatTotal() {
		statTotal = intelligence + strength + stamina + speed + skills;
		return statTotal; 
	}

	public void setSetTotal(int skills) {
		this.statTotal = statTotal;
	}
	
	

	@Override
	public String toString() {
		String result = "";
		result += ("\n   Stats:        Intelligence: " + getIntelligence());
		result += ("\n                 Strength:     " + getStrength());
		result += ("\n                 Stamina:      " + getStamina());
		result += ("\n                 Speed:        " + getSpeed());
		result += ("\n                 Skills:       " + getSkills());
		return result;

	}

}
