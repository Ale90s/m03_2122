public class Competicion {

    private String nomEquipos;
    private int total_punts;
    private int total_victories;
    private int total_derrotes;

    public Competicion(String nomEquipos, int total_punts, int total_derrotes, int total_victories) {

        this.nomEquipos = nomEquipos;
        this.total_punts = total_punts;
        this.total_derrotes = total_derrotes;
        this.total_victories = total_victories;
    }

    public String getNomEquipos() {
        return this.nomEquipos;
    }

    public void setNomEquipos(String nomEquipos) {
        this.nomEquipos = nomEquipos;
    }

    public int getTotal_punts() {
        return this.total_punts;
    }

    public void setTotal_punts(int total_punts) {
        this.total_punts = total_punts;
    }

    public int getTotal_Victories() {
        return this.total_victories;
    }

    public void setTotal_Victories(int total_Victories) {
        this.total_victories = total_Victories;
    }

    public int getTotal_derrotes() {
        return this.total_derrotes;
    }

    public void setTotal_derrotes(int total_derrotes) {
        this.total_derrotes = total_derrotes;
    }

}
