/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1Pol.Personajes;

import p1Pol.Armas.Arma;

/**
 *
 * @author rferrero
 */
public abstract class Personatge {
    
    protected String nom;
    protected int forca;
    protected int constitucio;
    protected int velocitat;
    protected int intelligencia;
    protected int sort;
    
    protected int ps;
    protected int pd;
    protected int pa;
    protected int pe;
    
    protected Arma arma;
    
    
    public Personatge(String nom,int forca,int cons,int vel,int inte,int sort) {
        this.nom           = nom;
        this.forca         = forca;
        this.constitucio   = cons;                
        this.velocitat     = vel;
        this.intelligencia = inte;
        this.sort          = sort;
        
        this.arma          =  null;
    }    
    
    
    public Personatge(String nom,int forca,int cons,int vel,int inte,int sort,Arma arma) {
        this.nom           = nom;
        this.forca         = forca;
        this.constitucio   = cons;                
        this.velocitat     = vel;
        this.intelligencia = inte;
        this.sort          = sort;
        
        this.arma          = arma;
        calculaDerivades();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public int getForca() {
        return forca;
    }

    public int getConstitucio() {
        return constitucio;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public int getIntelligencia() {
        return intelligencia;
    }

    public int getSort() {
        return sort;
    }

    public int getPs() {
        return ps;
    }

    public int getPd() {
        return pd;
    }

    public int getPa() {
        return pa;
    }

    public int getPe() {
        return pe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setConstitucio(int constitucio) {
        this.constitucio = constitucio;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public void setIntelligencia(int intelligencia) {
        this.intelligencia = intelligencia;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
        calculaDerivades();
    }
    
    
    public void calculaDerivades() {        
        ps = constitucio + forca;
        pd = (forca + arma.getWpow()) / 4;
        pa = intelligencia + sort + arma.getWvel();
        pe = velocitat + sort + intelligencia;
        
    }
}
