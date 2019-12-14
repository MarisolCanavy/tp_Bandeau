package bandeau;

public class Teletype extends Effet{

	public Teletype(Bandeau monBandeau) {
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
		for (int i = 0; i <= leMessage.length()-1; i++) {
			leMessageTab[i]=leMessage.substring(i,i+1);
			this.monBandeau.setMessage(String.join("", leMessageTab));
			this.monBandeau.sleep(500);
		}
	}

}
