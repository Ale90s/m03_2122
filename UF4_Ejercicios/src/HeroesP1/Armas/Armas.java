package HeroesP1.Armas;

public abstract class Armas {

    private String nombre;
    private double wpow; // Poder del arma
    private double wvel; // Velocidad del arma

    public Armas(String nombre, double wpow, double wvel) {
        this.nombre = nombre;
        this.wpow = wpow;
        this.wvel = wvel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getWpow() {
        return wpow;
    }

    public void setWpow(double wpow) {
        this.wpow = wpow;
    }

    public double getWvel() {
        return wvel;
    }

    public void setWvel(double wvel) {
        this.wvel = wvel;
    }

}
