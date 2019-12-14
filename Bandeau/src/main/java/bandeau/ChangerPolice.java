package bandeau;

import java.awt.Font;

public class ChangerPolice extends Effet {
	
	private String newPolice; 

	public ChangerPolice(Bandeau monBandeau, String myPolice) {
		super(monBandeau);
		newPolice=myPolice;
		
	}
	
	public String getNewPolice() {
		return newPolice;
	}

	public void jouerEffet() {
			this.monBandeau.setFont(new Font(newPolice, Font.BOLD,this.monBandeau.getFont().getSize()));
			this.monBandeau.sleep(100);
	}
}
