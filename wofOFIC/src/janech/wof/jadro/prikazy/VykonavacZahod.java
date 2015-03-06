/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janech.wof.jadro.prikazy;

import janech.wof.jadro.Hrac;

/**
 *
 * @author janik
 */
class VykonavacZahod implements IVykonavac {

    @Override
    public boolean vykonaj(Hrac paHrac, String paParameter) {
        if (!paHrac.zahodPredmet(paParameter)) {
            System.out.println("Nepodarilo sa!");
        }
        
        return false;
    }

    @Override
    public boolean vykonaj(Hrac paHrac) {
        System.out.println("Co mam zahodit?");
        return false;
    }

    @Override
    public String dajPopis() {
        return "Zahodi dany predmet do aktualnej miestnosti";
    }

}
