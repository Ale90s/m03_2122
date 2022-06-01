package p1.Personatges;

import p1.Armas.*;

public class Caballer extends Personatges {

    public Caballer(String nom, double forca, double constitucio, double velocitat, double inteligencia,
            double sort, Armas arma, int niv, int pex) {

        super(nom, forca, constitucio, velocitat, inteligencia, sort, arma, niv, pex);

    }

    public void calculaDerivades() {
        this.ps = constitucio + forca + inteligencia; // salut
        this.pd = (forca + ArmaPersonaje.getWpow()) / 4; // dany
        this.pa = inteligencia + sort + ArmaPersonaje.getWvel(); // probabilitat d'atacar
        this.pe = velocitat + sort + inteligencia; // probabilitat d'esquivar
    }
}
