package HeroesP1.Personatges;

import HeroesP1.Armas.Armas;

public class Assassi extends Personatges {

    public Assassi(String nom, double forca, double constitucio, double velocitat, double inteligencia,
            double sort, Armas arma, int niv, int pex) {

        super(nom, forca, constitucio, velocitat, inteligencia, sort, arma, niv, pex);

    }
    
    public void calculaDerivades() {
        this.ps = constitucio + forca; // salut
        this.pd = (forca + ArmaPersonaje.getWpow()) / 4; // dany
        this.pa = inteligencia + sort + ArmaPersonaje.getWvel()+velocitat; // probabilitat d'atacar
        this.pe = velocitat + sort + inteligencia; // probabilitat d'esquivar
    }
}
