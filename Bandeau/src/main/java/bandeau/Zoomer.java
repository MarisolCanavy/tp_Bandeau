package bandeau;

import java.awt.Font;

public class Zoomer extends Effet {

	private boolean zoom; 
	
	public Zoomer(Bandeau monBandeau, boolean monZoom) {
		super(monBandeau);
		zoom = monZoom ;
	}
	
	public void jouerEffet() {
		for (int i = 10; i < 30; i++) {
			if (zoom == true) {
				this.monBandeau.setFont(new Font(this.monBandeau.getFont().getFontName(), Font.BOLD,
						this.monBandeau.getFont().getSize() + i));

			} else {
				this.monBandeau.setFont(new Font(this.monBandeau.getFont().getFontName(), Font.BOLD,
						this.monBandeau.getFont().getSize() - i));
			}
			this.monBandeau.sleep(50);

		}
		this.monBandeau.sleep(200);
	}
	
}
