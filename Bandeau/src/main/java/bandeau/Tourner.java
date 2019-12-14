package bandeau;

public class Tourner extends Effet{

	private boolean tourLR; 
	
	public Tourner(Bandeau monBandeau, boolean quelTour) {
		super(monBandeau);
		tourLR = quelTour ;
	}

	public void jouerEffet() {
		for (int i = 0; i <= 100; i++) {
			if (tourLR == true) {
				this.monBandeau.setRotation(2 * Math.PI * i / 100);
			} else {
				this.monBandeau.setRotation(- 2 * Math.PI * i / 100);
			}
			this.monBandeau.sleep(10);
		}
	}
	
}
