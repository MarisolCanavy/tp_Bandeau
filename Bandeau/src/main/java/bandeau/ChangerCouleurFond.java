package bandeau;

import java.awt.Color;

public class ChangerCouleurFond extends Effet {
	private Color newColor; 
	
	public ChangerCouleurFond(Bandeau monBandeau, Color myColor) {
		super(monBandeau);
		newColor=myColor;
		
	}
	
	public Color getNewColor() {
		return newColor;
	}

	public void jouerEffet() {
			this.monBandeau.setBackground(getNewColor());
			this.monBandeau.sleep(50);
	}
}
