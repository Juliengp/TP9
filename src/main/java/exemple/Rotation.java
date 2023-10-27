package exemple;

import bandeau.Bandeau;


public class Rotation extends Effets{
    
    public Rotation(){
    }

    @Override
    public void effet(Bandeau bandeau){
        bandeau.setRotation(Math.PI / 2.0f);
        bandeau.sleep(500);
        }

    }
