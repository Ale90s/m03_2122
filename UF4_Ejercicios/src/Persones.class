public class Persones {
    
    private String nom;
    private int edat;
    private char sexe;
    private int DNI;


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public char getSexe() {
        return this.sexe;
    }

    public void setSexe(char sexe) {
        
        switch (sexe) {
            case 'h':
            case 'H':
                this.sexe = 'H';
                break;
            case 'd':
            case 'D':
                this.sexe = 'D';
                break;
            default:
                break;
        }
    }

    public int getDNI() {
        return this.DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void aumentaEdat() {
        this.edat++;
    }

    public void edatEnSegons(int edat) {
        // 31536000 son los segundos que tiene un año
        System.out.println(edat * 31536000);
    }
}