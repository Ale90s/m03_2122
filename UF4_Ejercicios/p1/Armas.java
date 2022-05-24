public class Armas {

    private double wpow; // Poder del arma
    private double wvel; // Velocidad del arma

    Armas(double wpow, double wvel) {
        this.wpow = wpow;
        this.wvel = wvel;
    }

    public double getWpow() {
        return this.wpow;
    }

    public void setWpow(double wpow) {
        this.wpow = wpow;
    }

    public double getWvel() {
        return this.wvel;
    }

    public void setWvel(double wvel) {
        this.wvel = wvel;
    }

}
