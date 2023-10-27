package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class CouleurFond extends Effets{

    public CouleurFond(){
    }

    public void effet(Bandeau bandeau){
        bandeau.setBackground(Color.BLACK);
        bandeau.setForeground(Color.WHITE);
        bandeau.sleep(1000);
    }
    
}
