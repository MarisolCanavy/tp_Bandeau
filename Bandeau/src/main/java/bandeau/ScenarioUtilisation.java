package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class ScenarioUtilisation {
	
	protected Bandeau monBandeau;
	
	protected List<Effet> lesEffets = new ArrayList();
	
	public static void main(String[] args) {
	    new ScenarioUtilisation().executerScenario();
    }
	
	public void ajouterEffet(Effet e, int a) {
		for (int i = 0 ; i<a;i++) {
			lesEffets.add(e);
		}
	}
	
	public void supprimerEffet(Effet e) {
		lesEffets.remove(e);
	}
	
	public void executerScenario() {      
		for (Effet e : lesEffets) {
			e.jouerEffet();
		}
	}
}
