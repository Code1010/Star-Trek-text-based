
public class Ship {

	private String name;
	private int hullIntegrity;
	private int galaxy;
	private int sector;
	private int passengers;
	private int power;	
	
	public Ship(String n, int h, int g, int s, int p, int pow){
		
		setName(n);
		setHullIntegrity(h);
		setGalaxy(g);
		setSector(s);
		setPassengers(p);
		setPower(pow);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGalaxy() {
		return galaxy;
	}

	public void setGalaxy(int galaxy) {
		this.galaxy = galaxy;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getHullIntegrity() {
		return hullIntegrity;
	}

	public void setHullIntegrity(int hullIntegrity) {
		this.hullIntegrity = hullIntegrity;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
