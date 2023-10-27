package exemple;

import bandeau.Bandeau;
import java.awt.Font;

public class Zoom extends Effets{
    
    public Zoom(){}

    @Override
    public void effet(Bandeau bandeau){
        for(int i = 5; i < 70; i += 5) {
            bandeau.setFont(new Font("Monospaced", Font.BOLD, i+1));
            bandeau.sleep(100);
            }}

        }


