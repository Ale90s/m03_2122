public class PersonesEx03 {

    public static void main(String[] args) {

        Persones Ale = new Persones("Alejandro Algarra", 22, 24314124);

        Persones Pedro = new Persones("Pedro Algarra", 24, 9994343);

        int aux = Ale.getEdat();

        Ale.setEdat(Pedro.getEdat());
        Pedro.setEdat(aux);

        System.out.println("Edad Pedro: " + Pedro.getEdat());
        System.out.println("Edad Ale: " + Ale.getEdat());

    }
}
