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
public class Guerrer extends Personatge {
  
    public Guerrer(String nom,int forca,int cons,int vel,int inte,int sort) {        
        super(nom,forca,cons,vel,inte,sort);
    }
    
    public Guerrer(String nom,int forca,int cons,int vel,int inte,int sort,Arma arma) {
        super(nom,forca,cons,vel,inte,sort,arma);
    }

    
}
