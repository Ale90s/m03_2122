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

        /*
        Imprime los personajes disponibles y sus características. Aquí es donde se calculan las características derivada
         */
        calculaDerivades();
        System.out.println(this.getNom() + " - " + this.tipoPersonaje());
        System.out.println("Tipo de arma: " + this.ArmaPersonaje.getNombre());
        System.out.println("-------------------");
        System.out.println("Nivel : " + this.niv);
        System.out.println("Experiencia : " + this.pex);
        System.out.println("-------------------");
        System.out.println("Salud : " + this.ps);
        System.out.println("Daño : " + this.pd);
        System.out.println("Prob. Atacar : " + this.pa);
        System.out.println("Prob. Esquivar : " + this.pe);
        System.out.println("");
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
        /*
            Los if's sirven como brackets que setean el nivel cuando llegan a cierta experiencia
         */
        if (pex < 100) {
            setNiv(0);
        } else if (pex == 100) {
            setNiv(1);
            subeNivel();
            System.out.println("Enhorabuena!! Has subido al nivel 1");
            System.out.println("");
        } else if (pex == 200) {
            setNiv(2);
            subeNivel();
            System.out.println("Enhorabuena!! Has subido al nivel 2");
            System.out.println("");
        } else if (pex == 500) {
            setNiv(3);
            subeNivel();
            System.out.println("Enhorabuena!! Has subido al nivel 3");
            System.out.println("");
        } else if (pex == 1000) {
            setNiv(4);
            subeNivel();
            System.out.println("Enhorabuena!! Has subido al nivel 4");
            System.out.println("");
        } else if (pex == 2000) {
            setNiv(5);
            subeNivel();
            System.out.println("Enhorabuena!! Has subido al nivel 5");
            System.out.println("");
        }

        this.pex = pex;

    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }

    public double getPd() {
        return pd;
    }

    public double getPa() {
        return pa;
    }

    public double getPe() {
        return pe;
    }

    public Armas getArmaPersonaje() {
        return ArmaPersonaje;
    }

    public void setArmaPersonaje(Armas ArmaPersonaje) {
        this.ArmaPersonaje = ArmaPersonaje;
    }

    public String tipoPersonaje() {
        /* 
        Función que utilizamos para saber qué tipo de personaje estamos utilizando
            x.x.Caballer tipoPersonaje[2] = "Cavaller";
         */
        String[] tipoPersonaje = this.getClass().toString().split("[.]");

        return tipoPersonaje[2];

    }

    public void subeNivel() {
        /*
           Cuando sube de nivel aumentamos las características
         */
        setForca(this.forca + 1);
        setConstitucio(this.constitucio + 1);
        setVelocitat(this.velocitat + 1);
        setInteligencia(this.inteligencia + 1);
        setSort(this.sort + 1);
    }

    public void recuperaParcialmentPS() {

        if (tipoPersonaje().equals("Cavaller")) {
            /*
            En caso de que sea Cavaller recupera un 10% de vida si tiene un 90% o menos, 
            en caso contrario se le resetea la vida.
             */
            double recuperaPs = ((constitucio + forca + inteligencia) / 10); // 10% salud maxima
            double noventaPorciento = (constitucio + forca + inteligencia) - recuperaPs; // 90% salud maxima

            System.out.println("");

            if (ps < noventaPorciento) { // en caso de que tenga menos del 90% recupera un 10%

                setPs(ps + recuperaPs);
                System.out.println("El personaje " + nom + " ha recuperado un 10% de salud.");

            } else { // en caso de que tenga más de un 90% resetea su salud al máximo
                System.out.println("El personaje " + nom + " vuelve a tener un 100% de salud.");
                ps = constitucio + forca + inteligencia;
            }
        }
    }

    public boolean contraAtaca() {

        if (tipoPersonaje().equals("Assassi")) {
            /*
            En caso de que sea un asesino se hace una tirada de dados y con la mitad
            de la probabilidad de ataque puede contraatacar.
             */
            int dados[] = new int[3];
            for (int i = 0; i < dados.length; i++) {
                dados[i] = (int) Math.floor(Math.random() * (25 - 1 + 1) + 1);
            }
            if (dados[0] + dados[1] + dados[2] <= (getPa() * 0.5)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
