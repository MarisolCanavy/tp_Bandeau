package bandeau;

public class JeuDuPendu extends Effet{

	public JeuDuPendu(Bandeau monBandeau) {
		super(monBandeau);
	}

	public void jouerEffet() {
		String leMessage = this.monBandeau.getMessage() ;
		String leMessageTab[] = new String[leMessage.length()] ;
		for (int i = 0; i <= leMessage.length()-1; i++) {
			leMessageTab[i]="_";
		}
		this.monBandeau.setMessage(String.join("", leMessageTab));
		this.monBandeau.sleep(500);
		for (int i = 0; i <= 20; i++) {
			int random = (int)(Math.random()*(leMessage.length()));
			leMessageTab[random]=leMessage.substring(random,random+1);
			this.monBandeau.setMessage(String.join("", leMessageTab));
			this.monBandeau.sleep(500);
		}
	}

}
