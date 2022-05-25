public class Armas {

    private String name;
    private double wpow; // Poder del arma
    private double wvel; // Velocidad del arma

    public Armas(String arma) {

        boolean armaCorrecta = false;

        while (!armaCorrecta) {
            switch (name) {
                case "Daga":
                    this.wpow = 5;
                    this.wvel = 15;
                    armaCorrecta = true;
                    break;
                case "Espasa":
                    this.wpow = 10;
                    this.wvel = 10;
                    armaCorrecta = true;
                    break;
                case "Martell de combat":
                    this.wpow = 15;
                    this.wvel = 5;
                    armaCorrecta = true;
                    break;
                default:
                    System.out.println("Arma Errónea. Daga, Espasa o Martell de combat");
                    break;
            }
        }
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
