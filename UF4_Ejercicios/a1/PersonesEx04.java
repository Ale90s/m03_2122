public class PersonesEx04 {
    
    public static void main(String[] args) {
        
        Persones Ale = new Persones("Alejandro Algarra", 22, 24314124);
        Persones Pedro = new Persones("Pedro Algarra", 24, 9994343);
        Persones Alberto = new Persones("Alberto Perez", 33, 40160945);

        Persones[] gente = {Ale, Pedro, Alberto};

        System.out.println("ANTES DE SER ORDENADO:");

        for (int i = 0; i < gente.length; i++) {
            System.out.printf("Edad %S: %d%n", gente[i].getNom(), gente[i].getEdat());
        }

        ordenaPorEdat(gente);
        System.out.println();
        System.out.println("DESPUÉS DE SER ORDENADO:");
        
        for (int i = 0; i < gente.length; i++) {
            System.out.printf("Edad %S: %d%n", gente[i].getNom(), gente[i].getEdat());
        }
    }

    public static void ordenaPorEdat(Persones[] gente) {

        Persones aux;

        for (int i = 0; i < gente.length; i++) {
            for (int j = 0; j < gente.length; j++) {
                if (i != j) {
                    if (gente[i].getEdat() > gente[j].getEdat()) {
                        aux = gente[i];
                        gente[i] = gente[j];
                        gente[j] = aux;
                    }
                }
            }
        }
    }
}
