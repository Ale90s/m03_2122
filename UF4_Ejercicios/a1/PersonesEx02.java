public class PersonesEx02 {
    
    public static void main(String[] args) {
        
        Persones Ale = new Persones("Alejandro Algarra", 22, 'H', 24314124);

        Persones Pedro = new Persones("Pedro Algarra", 24, 'H', 9994343);

        System.out.println("Información de Ale:");
        Ale.mostraInfo();

        System.out.println();
        System.out.println();

        System.out.println("Información de Pedro:");
        Pedro.mostraInfo();

        Ale.cumpleanys();
        System.out.println();
        System.out.println("Edad Ale después de cumplir años");
        System.out.println(Ale.getEdat());

        System.out.println("Edad Ale en segundos");
        Ale.edatEnSegons(Ale.getEdat());
    }
}