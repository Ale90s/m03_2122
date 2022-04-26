package m03.uf1.a5;

public class Ex12_GeneradorNoms {

    public static final int MAXAPELLIDO = 19;
    public static final int MAXNOMBRE = 9;
    public static final int MIN = 0;

    public static void main(String[] args) {

        String[] nom = {"Bjorn", "Helge", "Hans", "Harald", "Ivar", "Jensen",
             "Olson", "Sven", "Sigurd", "Niels"};
        String[] cognoms = {"Aaberg", "Aland", "Alfson", "Axel", "Backe", "Beck",
             "Bell", "Bengtsson", "Berg", "Bielke", "Bjerke", "Blom", "Bonde", "Borg",
            "Marca", "Breiner", "Bunderson", "Carlson", "Christensen", "Dahl"};
        int nombreAleatorio = MIN + (int) (Math.random() * (MAXNOMBRE - MIN + 1));
        int apellidoUnoAleatorio = MIN + (int) (Math.random() * (MAXNOMBRE - MIN + 1));
        int apellidoDosAleatorio = MIN + (int) (Math.random() * (MAXNOMBRE - MIN + 1));;

        System.out.printf("%s %s %s%n", nom[nombreAleatorio],
                 cognoms[apellidoUnoAleatorio], cognoms[apellidoDosAleatorio]);
    }
}
