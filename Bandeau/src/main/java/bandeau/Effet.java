package bandeau;

public abstract class Effet {
	
	protected final Bandeau monBandeau;
	
	public Effet(Bandeau monBandeau) {
		super();
		this.monBandeau = monBandeau;
	}

	public abstract void jouerEffet();

}
