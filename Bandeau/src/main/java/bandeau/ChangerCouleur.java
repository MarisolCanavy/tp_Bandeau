package bandeau;

import java.awt.Color;

public class ChangerCouleur extends Effet {

	private Color newColor; 
	private boolean newType; 
	
	public ChangerCouleur(Bandeau monBandeau, Color myColor, boolean type) {
		super(monBandeau);
		newColor=myColor;
		newType=type;
		
	}

	
	
	public Color getNewColor() {
		return newColor;
	}


	@Override
	public void jouerEffet() {
		if (newType == true) {
			this.monBandeau.setForeground(getNewColor());;
			this.monBandeau.sleep(50);
		}else {
			this.monBandeau.setBackground(getNewColor());
			this.monBandeau.sleep(50);
		}
	}
	
}
