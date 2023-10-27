package exemple;

import bandeau.Bandeau;


public class monBandeau {
    public static void main(String[] args){
        Bandeau bandeau = new Bandeau();
        Zoom zooms = new Zoom();
        Rotation tour =new Rotation();
        CouleurFond bkrg = new CouleurFond();

        //zooms.Zoomer(bandeau);
        //tour.tourner(bandeau);
        //bkrg.Changerbkgr(bandeau);

        Scenario scene = new Scenario();
        scene.addEffet(zooms,2);
        scene.addEffet(bkrg,1);
        scene.addEffet(tour, 1);
        scene.afficherEffets(bandeau);

    }}

    

