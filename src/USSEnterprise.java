
public class USSEnterprise extends Ship{

	private boolean shieldsUp;
	private String destination;
	private int warpFactor;
	private double velocity;
	private double eta; //minutes
	private int shieldLevel;
	private int photons;
	private boolean weaponsUp;
	private String captain;
	private int phaserLevel;
	private boolean computerFailure;
	private boolean warpDriveFailure;
	private boolean weaponsFailure;
	private boolean hullCompromised;
	
	
	public USSEnterprise(String n, int h, int g, int s, int p, int pow) {
		super(n, h, g, s, p, pow);
		
	}

}
