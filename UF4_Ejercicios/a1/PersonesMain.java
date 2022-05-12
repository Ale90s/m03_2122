public class PersonesMain {
    
    public static void main(String[] args) {
        
        Persones Ale = new Persones();

        Ale.setNom("Alejandro Algarra");
        Ale.setEdat(2);
        Ale.setDNI(1324124);

        Ale.edatEnSegons(Ale.getEdat());
        Ale.mostraInfo();
    }
}