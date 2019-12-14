package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private final Bandeau monBandeau = new Bandeau() ;
    
    public static void main(String[] args) {
	    new ExempleDUtilisation().exemple();
    }
    
    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
//Notre Scénario
		ScenarioUtilisation scenario = new ScenarioUtilisation();
		monBandeau.setMessage("Bienvenue");
		scenario.ajouterEffet(new Teletype(monBandeau), 1);
		scenario.ajouterEffet(new JeuDuPendu(monBandeau), 1);
		scenario.ajouterEffet(new Zoomer(monBandeau,true), 1);
		scenario.ajouterEffet(new Zoomer(monBandeau,false), 1);
		scenario.ajouterEffet(new Clignoter(monBandeau), 3);
		scenario.ajouterEffet(new Zoomer(monBandeau,true), 1);
		scenario.ajouterEffet(new Zoomer(monBandeau,false), 1);		
		scenario.ajouterEffet(new Tourner(monBandeau,true), 2);
		scenario.ajouterEffet(new Tourner(monBandeau,false), 1);
		scenario.ajouterEffet(new ChangerCouleur(monBandeau,Color.magenta,true), 1);
		scenario.ajouterEffet(new ChangerCouleur(monBandeau,Color.green,false), 1);
		scenario.ajouterEffet(new ChangerPolice(monBandeau,"Courier new"), 1);
		scenario.executerScenario();
		
   }
}
