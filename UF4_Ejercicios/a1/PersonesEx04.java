public class PersonesEx04 {
    
    public static void main(String[] args) {
        
        Persones Ale = new Persones("Alejandro Algarra", 22, 'H', 24314124);
        Persones Pedro = new Persones("Pedro Algarra", 24, 'H', 9994343);
        Persones Alberto = new Persones("Albero Perez", 33, 'H', 40160945);

        Persones[] gente = {Ale, Pedro, Alberto};

        
    }

    public static void ordenaPorEdat(Persones[] gente) {

        String nombre;

        for (int i = 0; i < gente.length; i++) {
            for (int j = 0; j < gente.length; j++) {
                if (i != j) {
                    if (gente[i].getEdat() > gente[j].getEdat()) {

                        



                    }
                }
            }
        }
    }
}
