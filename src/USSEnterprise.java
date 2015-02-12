
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
	
	
	public USSEnterprise(String n, int h, int g, int s, int p, int pow, String capt) {
		super(n, h, g, s, p, pow);
		shieldsUp = true;
		destination = "none";
		warpFactor = 0;
		velocity = 0;
		eta = 0;
		shieldLevel = 100;
		photons = 64;
		weaponsUp = false;
		captain = capt;
		phaserLevel = 0;
		computerFailure = false;
		warpDriveFailure = false;
		weaponsFailure = false;
		hullCompromised = false;
	}

}
