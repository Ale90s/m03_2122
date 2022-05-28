public class Masajista extends Persona {

    private int anyosExperiencia;
    private String titulacion;

    public Masajista(int id, String nombre, String apellidos, int edad, int anyosExperiencia, String titulacion) {
        super(id, nombre, apellidos, edad);
        this.anyosExperiencia = anyosExperiencia;
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return this.anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getTitulacion() {
        return this.titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void concentrarse() {

        System.out.println("No tanta concentración.");

    }
}
