package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

public class Scenario {

    public Scenario(){
    }

    ArrayList<Effets> listeEffets = new ArrayList<Effets>();

    public void addEffet( Effets effet, int nbEffet){
        for(int i=0 ; i<nbEffet ; i++){
            listeEffets.add(effet);
        }
    }

    public void afficherEffets(Bandeau bandeau){
        for(Effets e :listeEffets){
            e.effet(bandeau);
        }
    }

    
}
