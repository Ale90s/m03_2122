package p1.Personatges;

import p1.Armas.*;

public abstract class Personatges {

    protected String nom;

    protected double forca;
    protected double constitucio;
    protected double velocitat;
    protected double inteligencia;
    protected double sort;

    protected double ps; // salut
    protected double pd; // dany
    protected double pa; // probabilitat d'atacar
    protected double pe; // probabilitat d'esquivar

    Armas ArmaPersonaje;

    protected int niv;
    protected int pex;

    public Personatges(String nom, double forca, double constitucio, double velocitat, double inteligencia,
            double sort, Armas arma, int niv, int pex) {
        this.nom = nom;
        this.forca = forca;
        this.constitucio = constitucio;
        this.velocitat = velocitat;
        this.inteligencia = inteligencia;
        this.sort = sort;
        this.ArmaPersonaje = arma;
        this.niv = niv;
        this.pex = pex;
    }

    public void calculaDerivades() {
        this.ps = constitucio + forca; // salut
        this.pd = (forca + ArmaPersonaje.getWpow()) / 4; // dany
        this.pa = inteligencia + sort + ArmaPersonaje.getWvel(); // probabilitat d'atacar
        this.pe = velocitat + sort + inteligencia; // probabilitat d'esquivar
    }

    public void getcaracteristicas() {

        calculaDerivades();
        System.out.println("Características de " + this.nom);
        System.out.println("Fuerza : " + this.forca);
        System.out.println("Constitución : " + this.constitucio);
        System.out.println("Velocidad : " + this.velocitat);
        System.out.println("Inteligencia : " + this.inteligencia);
        System.out.println("Suerte : " + this.sort);
        System.out.println("-------------------");
        System.out.println("Tipo de arma: " + this.ArmaPersonaje);
        System.out.println("-------------------");
        System.out.println("Nivel : " + this.niv);
        System.out.println("Experiencia : " + this.pex);
        System.out.println("-------------------");
        System.out.println("Salud : " + this.ps);
        System.out.println("Daño : " + this.pd);
        System.out.println("Prob. Atacar : " + this.pa);
        System.out.println("Prob. Esquivar : " + this.pe);
        System.out.println("");
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getForca() {
        return this.forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getConstitucio() {
        return this.constitucio;
    }

    public void setConstitucio(double constitucio) {
        this.constitucio = constitucio;
    }

    public double getVelocitat() {
        return this.velocitat;
    }

    public void setVelocitat(double velocitat) {
        this.velocitat = velocitat;
    }

    public double getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getSort() {
        return this.sort;
    }

    public void setSort(double sort) {
        this.sort = sort;
    }

    public int getNiv() {
        return this.niv;
    }

    public void setNiv(int niv) {
        this.niv = niv;
    }

    public int getPex() {
        return this.pex;
    }

    public void setPex(int pex) {
        this.pex = pex;
    }
}
