package program5;


public class Character {

	private String name;
	private String team;
	private String universe;
	private String homePlanet;
	Stats s;
	public static int numCharacters = 0;

	public Character() {
		numCharacters++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getUniverse() {
		return universe;
	}

	public void setUniverse(String universe) {
		this.universe = universe;
	}

	public String getHomePlanet() {
		return homePlanet;
	}

	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}

	public Stats getS() {
		return s;
	}

	public void setS(Stats s) {
		this.s = s;
	}

	@Override
	public String toString() {
		String result = "";
		result += "   Name:         " + getName();
		result += "\n   Team:         " + getTeam();
		result += "\n   Universe:     " + getUniverse();
		result += "\n   Home Planet:  " + getHomePlanet();
		System.out.println("");
		result += s;
		result += ("\n  ");
		return result;
	}

}
