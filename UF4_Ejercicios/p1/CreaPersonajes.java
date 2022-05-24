public class CreaPersonajes {
    public static void main(String[] args) {

    }

    public void creaPersonajes() {

    }

    public void crearGuerrero(String nom, double forca, double constitucio, double velocitat, double inteligencia,
            double sort) {

        double suma = forca + constitucio + velocitat + inteligencia + sort;

        if (suma == 60) {
            if ((forca >= 3 && forca <= 18) && (constitucio >= 3 && constitucio <= 18) &&
                    (velocitat >= 3 && velocitat <= 18) && (inteligencia >= 3 && inteligencia <= 18) &&
                    (sort >= 3 && sort <= 18)) {

                // Guerrer war = new Guerrer(nom, forca, constitucio, velocitat, inteligencia,
                // sort);

            } else {
                System.out.println("Se han repartidos los puntos de características de manera errónea.");
                System.out.println("Valores en los campos entre 3 y 18.");
            }

        } else {
            System.out.println("60 puntos de constitución en total.");
        }
    }
}
