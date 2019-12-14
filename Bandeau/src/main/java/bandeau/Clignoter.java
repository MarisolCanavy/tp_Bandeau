package bandeau;

public class Clignoter extends Effet{

	public Clignoter(Bandeau monBandeau) {
		super(monBandeau);
	}

	public void jouerEffet() {
		String leMessage = this.monBandeau.getMessage() ;
		for (int i = 0; i <= 1; i++) {
			this.monBandeau.setMessage("");
			this.monBandeau.sleep(200);
			this.monBandeau.setMessage(leMessage);
			this.monBandeau.sleep(200);

		}
	}

}
